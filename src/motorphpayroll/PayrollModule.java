package motorphpayroll;

// Computes gross and net salary of employees depending on hours worked
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PayrollModule extends AttendanceModule implements RecordOperations {
    
    private TaxAndDeductionsModule deductionsModule = new TaxAndDeductionsModule();
    private double hourlyRate;
    private double grossPay;
    private double monthlyWorkHours;
    private Map <String, Double> workHoursMap;
   
    public PayrollModule(int employeeId, double hourlyRate) {
        super(employeeId);
        this.hourlyRate = hourlyRate;
        this.workHoursMap = super.getAllEmployeesMonthlyHours(); // populates the hashmap with all work hours of  all employees each month
    }
    
    // loads payroll details of all employees in a list 
    @Override
    public List <String []> getAllRecords() {
        List <String []> payrollRecords = new ArrayList<>();
        
        try (Connection con = DatabaseConnection.Connect()) {
            String query = "SELECT * FROM users";
            PreparedStatement ptst = con.prepareStatement(query);
            ResultSet rs = ptst.executeQuery();
                          
            while (rs.next()) {
                // set the employeeID to the current employee
                super.setEmployeeId(rs.getInt("id"));
                hourlyRate = rs.getDouble("Hourly_rate");
                
                // calculates the monthly salary of the current employee
                calculateMonthlyGrossSalary();
                 
                // add the payroll details in the list
                 payrollRecords.add(new String [] {
                 rs.getString("id"),
                 rs.getString("First_name") + " " + rs.getString("Last_name"),
                 rs.getString("Hourly_rate"),
                 String.valueOf(monthlyWorkHours),
                 String.valueOf(deductionsModule.getPhilHealthDeduction(getGrossPay())),
                 String.valueOf(deductionsModule.getSSSDeduction(getGrossPay())),
                 String.valueOf(deductionsModule.getPagIbigDeduction(getGrossPay())),
                 String.valueOf(deductionsModule.getWithholdingTax(getTaxableIncome())),
                 String.valueOf(getGrossPay()),
                 String.valueOf(getNetSalary())
                });
            }                                 
        } catch (Exception e) {e.printStackTrace();}
        
        return payrollRecords;
    }
    
    @Override
    public List <String []> search (String searchInput) {
        List <String []> searchResults = new ArrayList<>();
        
        try (Connection con = DatabaseConnection.Connect()) {
            String query = "SELECT * FROM users";
            PreparedStatement ptst = con.prepareStatement(query);
            ResultSet rs = ptst.executeQuery();
                       
            while (rs.next()) {
                if (rs.getString("id").contains(searchInput) ||
                    rs.getString("Last_Name").toLowerCase().contains(searchInput.toLowerCase()) ||
                    rs.getString("First_Name").toLowerCase().contains(searchInput.toLowerCase())) 
                {
                    // set the employeeID to the current employee
                    super.setEmployeeId(rs.getInt("id"));
                    hourlyRate = rs.getDouble("Hourly_rate");
                    
                    // calculates the monthly salary of the current employee in the resultset and populates the salary related variables
                    calculateMonthlyGrossSalary();
                    
                    searchResults.add(new String[]{
                    rs.getString("id"),
                    rs.getString("First_name") + " " + rs.getString("Last_name"),
                    rs.getString("Hourly_rate"),
                    String.valueOf(monthlyWorkHours),
                    String.valueOf(deductionsModule.getPhilHealthDeduction(getGrossPay())),
                    String.valueOf(deductionsModule.getSSSDeduction(getGrossPay())),
                    String.valueOf(deductionsModule.getPagIbigDeduction(getGrossPay())),
                    String.valueOf(deductionsModule.getWithholdingTax(getTaxableIncome())),
                    String.valueOf(getGrossPay()),
                    String.valueOf(getNetSalary())                                                     
                });
                }
            }
            
        } catch (Exception e) {e.printStackTrace();}
        
        return searchResults;
    }
    
    public void calculateMonthlyGrossSalary() {
        // key for the hashmap (id, month, year)
        String [] key = {String.valueOf(getEmployeeId()), getSelectedMonth(getSelectedMonth()), getSelectedYear()};
        
        /* retrieves the total work hours of an employee in a month in the hashmap. if the selected year or month does not exist in the hashmap,
        a default value of 0.0 will be placed instead to avoid null exceptions */
        double monthlyHours = workHoursMap.getOrDefault(Arrays.toString(key), 0.0);
        
        double monthlySalary = monthlyHours * hourlyRate;
        if (monthlySalary <= 0) {
            this.grossPay = 0;
        }
        else {
            this.grossPay = Math.round((monthlySalary) * 100.0) / 100.0;
        }
        this.monthlyWorkHours = monthlyHours;
    }
    
    public void setHourlyRate (double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
    public double getHourlyRate () {
        return hourlyRate;
    }
    
    public double getGrossPay () {
        return grossPay;
    }

    public double getNetSalary () {
        return Math.round((getGrossPay() - getTotalDeductions()) * 100.0) / 100.0;       
    }
    
    public double getTotalDeductions () {
        return Math.round((getGovernmentDeductionsTotal() + deductionsModule.getWithholdingTax(getGrossPay())) * 100.0) / 100.0;
    }
    
    public double getGovernmentDeductionsTotal () {
        return deductionsModule.getPagIbigDeduction(getGrossPay())
             + deductionsModule.getPhilHealthDeduction(getGrossPay())
             + deductionsModule.getSSSDeduction(getGrossPay());
    }
    
    public double getTaxableIncome () {       
        return Math.round((getGrossPay() - getGovernmentDeductionsTotal()) * 100.0) / 100.0;             
    }
        
    
         
    
    
}

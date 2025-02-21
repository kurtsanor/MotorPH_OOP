package motorphpayroll;

// Computes gross and net salary of employees depending on hours worked

import java.sql.Connection;
import javax.swing.JTable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class SalaryCalculationModule extends AttendanceModule {

    private TaxAndDeductionsModule deductionsModule = new TaxAndDeductionsModule();
    private double hourlyRate;
    private double grossPay;
    private int monthlyWorkHours;

    public SalaryCalculationModule(int employeeId, double hourlyRate) {
        super(employeeId);
        this.hourlyRate = hourlyRate;
    }
    
    public void calculateMonthlyGrossSalary() {
        int monthlyHours = super.getMonthlyHoursWorked();
        double monthlySalary = monthlyHours * hourlyRate;
        if (monthlySalary <= 0) {
            this.grossPay = 0;
        }
        else {
            this.grossPay = Math.round((hourlyRate * monthlyHours) * 100.0) / 100.0;
        }
        this.monthlyWorkHours = monthlyHours;
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
        
    // loads payroll details of all employees in a table
    @Override
    public void loadTable(JTable table) {
        try (Connection con = DatabaseConnection.Connect()) {
            String query = "SELECT * FROM users";
            PreparedStatement ptst = con.prepareStatement(query);
            ResultSet rs = ptst.executeQuery();
            
            DefaultTableModel tablemodel = (DefaultTableModel)table.getModel();
            tablemodel.setRowCount(0);
            
            while (rs.next()) {
                super.setEmployeeId(rs.getInt("id"));
                hourlyRate = rs.getDouble("Hourly_rate");
                calculateMonthlyGrossSalary();
                                                             
                 tablemodel.addRow(new Object [] {
                 rs.getInt("id"),
                 rs.getString("First_name") + " " + rs.getString("Last_name"),
                 "₱"+rs.getString("Hourly_rate"),
                 monthlyWorkHours,
                 "₱"+deductionsModule.getPhilHealthDeduction(getGrossPay()),
                 "₱"+deductionsModule.getSSSDeduction(getGrossPay()),
                 "₱"+deductionsModule.getPagIbigDeduction(getGrossPay()),
                 "₱"+deductionsModule.getWithholdingTax(getTaxableIncome()),
                 "₱"+getGrossPay(),
                 "₱"+getNetSalary()
                });
            }                                 
        } catch (Exception e) {e.printStackTrace();}
    }
    
    
 

}

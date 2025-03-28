
package oopClasses;

import java.time.LocalDate;
import java.util.List;


public class Finance extends User implements BasicActions {
    
    private PayrollModule payrollModule;
    private LeaveManagementModule leaveModule;
    
    public Finance (int employeeId, String firstName, String lastName, String position, String status, String birthday, String address,
                 String phoneNumber, String philhealthNumber, String sssNumber, String pagIbigNumber, String tinNumber, double hourlyRate,
                 String role) 
    
    {
        super(employeeId, firstName, lastName, position, status, birthday, address, phoneNumber, 
                philhealthNumber, sssNumber, pagIbigNumber, tinNumber, hourlyRate, role);
        this.payrollModule = new PayrollModule(employeeId, hourlyRate);
        this.leaveModule = new LeaveManagementModule(this);
        
    }
    
    @Override
    public String [] viewPersonalSalary (String month, String year) {
        this.payrollModule.setSelectedMonth(month);
        this.payrollModule.setSelectedYear(year);
        this.payrollModule.calculateMonthlyGrossSalary();
               
        double grossPay = this.payrollModule.getGrossPay();
        double netPay = this.payrollModule.getNetSalary();
        double sssDeduction = TaxAndDeductionsModule.getSSSDeduction(grossPay);
        double philhealthDeduction = TaxAndDeductionsModule.getPhilHealthDeduction(grossPay);
        double pagibigDeduction = TaxAndDeductionsModule.getPagIbigDeduction(grossPay);
        double witholdingTex = TaxAndDeductionsModule.getWithholdingTax(netPay);
        double totalDeductions = this.payrollModule.getTotalDeductions();
        double totalHoursWorked = this.payrollModule.getMonthlyWorkHours();
        
        return new String [] {
            String.valueOf(grossPay),
            String.valueOf(netPay),
            String.valueOf(sssDeduction),
            String.valueOf(philhealthDeduction),
            String.valueOf(pagibigDeduction),
            String.valueOf(witholdingTex),
            String.valueOf(totalDeductions),
            String.valueOf(totalHoursWorked)};
    }
    
    @Override
    public List<String[]> viewPersonalAttendanceRecords (String month, String year) {
        AttendanceModule attendanceModule = new AttendanceModule(getId());
        attendanceModule.setSelectedMonth(month);
        attendanceModule.setSelectedYear(year);
        
        return attendanceModule.getAllRecords();
    }
    
    @Override
    public boolean requestForLeave (int employeeID, LocalDate startDate, LocalDate endDate, String reason, String firstName, String lastName, String leaveType) {      
        return this.leaveModule.submitLeaveRequest(employeeID, startDate, endDate, reason, firstName, lastName, leaveType);
    }
    
    @Override
    public List<String[]> viewPersonalLeaveRecords (int employeeID) {       
        return this.leaveModule.getAllRecords(employeeID);
    }
    
    @Override
    public boolean hasHrAccess() {
        return false;
    }
    @Override
    public boolean hasItAccess() {
        return false;
    }
    @Override
    public boolean hasFinanceAccess() {
        return true;
    }
    
    public List<String []> loadAllPayrollData (String month, String year) {
        this.payrollModule.setSelectedMonth(month);
        this.payrollModule.setSelectedYear(year);
        
        return this.payrollModule.getAllRecords();
    }
    
    public List<String[]> searchPayrollDataByEmployee (String searchInput, String month, String year) {
        this.payrollModule.setSelectedMonth(month);
        this.payrollModule.setSelectedYear(year);
        
        return this.payrollModule.search(searchInput);
    }
    
}


package oopClasses;

import java.time.LocalDate;
import java.util.List;


public class RegularEmployee extends User implements BasicActions {
    
    public RegularEmployee (int employeeId, String firstName, String lastName, String position, String status, String birthday, String address,
                 String phoneNumber, String philhealthNumber, String sssNumber, String pagIbigNumber, String tinNumber, double hourlyRate,
                 String role) 
    
    {
        super(employeeId, firstName, lastName, position, status, birthday, address, phoneNumber, 
                philhealthNumber, sssNumber, pagIbigNumber, tinNumber, hourlyRate, role);
    }
    
    @Override
    public String [] viewPersonalSalary (String month, String year) {
        PayrollModule payrollModule = new PayrollModule(getId(), getHourlyRate());
        payrollModule.setSelectedMonth(month);
        payrollModule.setSelectedYear(year);
        payrollModule.calculateMonthlyGrossSalary();
               
        double grossPay = payrollModule.getGrossPay();
        double netPay = payrollModule.getNetSalary();
        double sssDeduction = TaxAndDeductionsModule.getSSSDeduction(grossPay);
        double philhealthDeduction = TaxAndDeductionsModule.getPhilHealthDeduction(grossPay);
        double pagibigDeduction = TaxAndDeductionsModule.getPagIbigDeduction(grossPay);
        double witholdingTex = TaxAndDeductionsModule.getWithholdingTax(netPay);
        double totalDeductions = payrollModule.getTotalDeductions();
        double totalHoursWorked = payrollModule.getMonthlyWorkHours();
        
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
        AttendanceModule attendanceModule = new AttendanceModule(employeeId);
        attendanceModule.setSelectedMonth(month);
        attendanceModule.setSelectedYear(year);
        
        return attendanceModule.getAllRecords();
    }
    
    @Override
    public boolean requestForLeave (int employeeID, LocalDate startDate, LocalDate endDate, String reason, String firstName, String lastName, String leaveType) {
        LeaveManagementModule leaveModule = new LeaveManagementModule(this);
        
        return leaveModule.submitLeaveRequest(employeeID, startDate, endDate, reason, firstName, lastName, leaveType);
    }
    
    public List<String[]> viewPersonalLeaveRecords (int employeeID) {
        LeaveManagementModule leaveModule = new LeaveManagementModule(this);
        
        return leaveModule.getAllRecords(employeeID);
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
        return false;
    }
    
    
    
}

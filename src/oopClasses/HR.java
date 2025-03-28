/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopClasses;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author keith
 */
public class HR extends User implements BasicActions {
    
    private EmployeeManagementModule empManagement;
    private PayrollModule payrollModule;
    private LeaveManagementModule leaveModule;
    
    public HR (int employeeId, String firstName, String lastName, String position, String status, String birthday, String address,
               String phoneNumber, String philhealthNumber, String sssNumber, String pagIbigNumber, String tinNumber, double hourlyRate,
               String role) 
    
    {
        super(employeeId, firstName, lastName, position, status, birthday, address, phoneNumber, 
                philhealthNumber, sssNumber, pagIbigNumber, tinNumber, hourlyRate, role);
        this.empManagement = new EmployeeManagementModule();    
        this.payrollModule = new PayrollModule(getId(), getHourlyRate());
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
        return true;
    }
    @Override
    public boolean hasItAccess() {
        return false;
    }
    @Override
    public boolean hasFinanceAccess() {
        return false;
    }
    
    public List<String []> viewAllEmployees () {
        return this.empManagement.getAllRecords();
    }
    
    public List<String []> searchEmployees (String searchInput) {
        return this.empManagement.search(searchInput);
    }
    
    public boolean addNewEmployee (RegularEmployee employee) {
        return this.empManagement.addEmployee(employee);
    }
    
    public boolean editExistingEmployee (int employeeID, RegularEmployee employee) {
        return this.empManagement.editEmployee(employeeID, employee);
    }
    
    public boolean deleteEmployeeRecord (int employeeID) {
        return this.empManagement.deleteEmployee(employeeID);
    }
    
    public RegularEmployee viewEmployeeByID (int employeeID) {
        return this.empManagement.getEmployeeDetails(employeeID);
    } 
    
    public List<String[]> loadEmployeeAttendanceByID (int employeeID, String month, String year) {
        AttendanceModule attendanceModule = new AttendanceModule(employeeID);
        attendanceModule.setSelectedMonth(month);
        attendanceModule.setSelectedYear(year);
        
        return attendanceModule.getAllRecords();
    }
    
    public List<String[]> loadAllEmployeeLeaveRecords () {       
        return this.leaveModule.getAllRecords();
    }
    
    public boolean approveEmployeeLeave (int requestID) {      
        return this.leaveModule.approveLeave(requestID);
    }
    
    public boolean denyEmployeeLeave (int requestID) {       
        return this.leaveModule.denyLeave(requestID);
    }
    
    
    
    
    
    
    
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopClasses;

import java.util.List;

/**
 *
 * @author keith
 */
public class HR extends User implements BasicActions {
    
    private EmployeeManagementModule empManagement;
    
    public HR (int employeeId, String firstName, String lastName, String position, String status, String birthday, String address,
               String phoneNumber, String philhealthNumber, String sssNumber, String pagIbigNumber, String tinNumber, double hourlyRate,
               String role) 
    
    {
        super(employeeId, firstName, lastName, position, status, birthday, address, phoneNumber, 
                philhealthNumber, sssNumber, pagIbigNumber, tinNumber, hourlyRate, role);
        this.empManagement = new EmployeeManagementModule();       
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
        return empManagement.getAllRecords();
    }
    
    public List<String []> searchEmployees (String searchInput) {
        return empManagement.search(searchInput);
    }
    
    public boolean addNewEmployee (RegularEmployee employee) {
        return empManagement.addEmployee(employee);
    }
    
    public boolean editExistingEmployee (int employeeID, RegularEmployee employee) {
        return empManagement.editEmployee(employeeID, employee);
    }
    
    public boolean deleteEmployeeRecord (int employeeID) {
        return empManagement.deleteEmployee(employeeID);
    }
    
    
    
    
    
    
    
    
    
    
    
}

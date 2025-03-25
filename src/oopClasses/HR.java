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
public class HR extends User {
    
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
    
    
    
    
    
    
    
    
    
}

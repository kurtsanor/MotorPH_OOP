
package oopClasses;

import java.util.List;


public class Finance extends User {
    
    PayrollModule payrollModule;
    
    public Finance (int employeeId, String firstName, String lastName, String position, String status, String birthday, String address,
                 String phoneNumber, String philhealthNumber, String sssNumber, String pagIbigNumber, String tinNumber, double hourlyRate,
                 String role) 
    
    {
        super(employeeId, firstName, lastName, position, status, birthday, address, phoneNumber, 
                philhealthNumber, sssNumber, pagIbigNumber, tinNumber, hourlyRate, role);
        this.payrollModule = new PayrollModule(employeeId, hourlyRate);
        
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
        payrollModule.setSelectedMonth(month);
        payrollModule.setSelectedYear(year);
        
        return payrollModule.getAllRecords();
    }
    
    public List<String[]> searchPayrollDataByEmployee (String searchInput, String month, String year) {
        payrollModule.setSelectedMonth(month);
        payrollModule.setSelectedYear(year);
        
        return payrollModule.search(searchInput);
    }
    
}

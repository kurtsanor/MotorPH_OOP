
package oopClasses;


public class RegularEmployee extends User {
    
    public RegularEmployee (int employeeId, String firstName, String lastName, String position, String status, String birthday, String address,
                 String phoneNumber, String philhealthNumber, String sssNumber, String pagIbigNumber, String tinNumber, double hourlyRate,
                 String role) 
    
    {
        super(employeeId, firstName, lastName, position, status, birthday, address, phoneNumber, 
                philhealthNumber, sssNumber, pagIbigNumber, tinNumber, hourlyRate, role);
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

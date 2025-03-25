package oopClasses;


public abstract class User {
    
    protected int employeeId;
    protected String firstName;
    protected String lastName;
    protected String position;
    protected String status;
    protected String birthday;
    protected String address;
    protected String phoneNumber;
    protected String sssNumber;
    protected String pagIbigNumber;
    protected String tinNumber;
    protected double hourlyRate;
    protected String philhealthNumber;
    protected String role;
    
    public User(int employeeId, String firstName, String lastName, String position, String status, String birthday, String address,
                 String phoneNumber, String philhealthNumber, String sssNumber, String pagIbigNumber, String tinNumber, double hourlyRate,
                 String role) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.status = status;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.sssNumber = sssNumber;
        this.pagIbigNumber = pagIbigNumber;
        this.tinNumber = tinNumber;
        this.hourlyRate = hourlyRate;
        this.philhealthNumber = philhealthNumber;
        this.role = role;
    }
    
    
    public int getId () { return employeeId;}
    public String getFirstName () { return firstName;}
    public String getLastName () { return lastName;}
    public String getPosition () { return position;}
    public String getStatus () { return status;}
    public String getBirthday () { return birthday;}
    public String getAddress () { return address;}
    public String getPhoneNumber () { return phoneNumber;}
    public String getPhilhealthNumber() { return philhealthNumber;}
    public String getSSSNumber () { return sssNumber;}
    public String getPagibigNumber () { return pagIbigNumber;}
    public String getTinNumber () { return tinNumber;}
    public double getHourlyRate() { return hourlyRate;}
    public String getRole() { return role;}
    
    public abstract boolean hasHrAccess();
    public abstract boolean hasItAccess();
    public abstract boolean hasFinanceAccess();
   
    

    
    
          
    
    
    
    
}

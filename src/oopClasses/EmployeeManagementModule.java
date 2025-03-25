package oopClasses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


// CRUD operations and employee retrievals
public class EmployeeManagementModule implements RecordOperations {
    
    public EmployeeManagementModule () {} // default constructor
    
    @Override
    public List <String []> getAllRecords () {
        List <String []> employeeList = new ArrayList<>();
        try (Connection con = DatabaseConnection.Connect()) {
            String query = "SELECT * FROM users";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                employeeList.add(new String [] {rs.getString("id"), rs.getString("Last_Name"), rs.getString("First_Name")});
            }
                       
        } catch (Exception e) {}
        
        return employeeList;
    }
    
    // searches existing employees 
    @Override
    public List <String []> search (String searchInput) {
        List <String []> searchResults = new ArrayList<>();
        
        try (Connection con = DatabaseConnection.Connect()) {
            String query = "SELECT First_Name, Last_Name, id FROM users WHERE id LIKE ? OR LOWER(CONCAT(First_Name, ' ', Last_Name)) LIKE ?";
            PreparedStatement st = con.prepareStatement(query);
            String searchPattern = "%" + searchInput.toLowerCase() + "%";
            st.setString(1, searchPattern);
            st.setString(2, searchPattern);
            ResultSet rs = st.executeQuery();
                    
            // if an employee name or id matches the search text, it adds it to the arraylist
            while (rs.next()) {
                String employeeID = rs.getString("id");
                String lastName = rs.getString("Last_Name");
                String firstName = rs.getString("First_Name");

                searchResults.add(new String[]{employeeID, lastName, firstName});        
            }
                                           
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return searchResults;
    }
     
    public RegularEmployee getEmployeeDetails (int chosenEmployeeId) {              
        try (Connection con = DatabaseConnection.Connect()) {
             String query = "SELECT * FROM users WHERE id = ?";
             PreparedStatement ptst = con.prepareStatement(query);
             ptst.setInt(1, chosenEmployeeId);
             ResultSet rs = ptst.executeQuery();
             
             if (rs.next()) {
                return new RegularEmployee(rs.getInt("id"), rs.getString("First_Name"), rs.getString("Last_Name"), rs.getString("Position"), rs.getString("Status"), rs.getString("Birthdate"), rs.getString("address")
                        ,rs.getString("Phone_number"), rs.getString("Philhealth"), rs.getString("SSS"), rs.getString("Pagibig"), rs.getString("TIN"), rs.getDouble("Hourly_Rate"), rs.getString("Role"));                               
             }
                                   
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
        
    public boolean addEmployee (RegularEmployee employee) {                            
        try (Connection con = DatabaseConnection.Connect()) {
             String query = "INSERT INTO users (First_Name, Last_Name, Address, Birthdate, Position, Phone_number, SSS, Philhealth, TIN, Pagibig, Status, Hourly_Rate, Role) "
                          + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)"; 
             
             PreparedStatement ptst = con.prepareStatement(query);
             ptst.setString(1,  employee.getFirstName()); // first name
             ptst.setString(2,  employee.getLastName()); // last name
             ptst.setString(3,  employee.getAddress()); // address
             ptst.setString(4,  employee.getBirthday()); // Birthdate
             ptst.setString(5,  employee.getPosition()); // Position
             ptst.setString(6,  employee.getPhoneNumber()); // Phone_number
             ptst.setString(7,  employee.getSSSNumber()); // SSS
             ptst.setString(8,  employee.getPhilhealthNumber()); // Philhealth
             ptst.setString(9,  employee.getTinNumber()); // TIN
             ptst.setString(10, employee.getPagibigNumber()); // Pagibig
             ptst.setString(11, employee.getStatus()); // Status
             ptst.setDouble(12, employee.getHourlyRate()); // Hourly_Rate
             ptst.setString(13, employee.getRole()); // Role
             ptst.executeUpdate();
             
             return true;
             
        } catch (Exception e) {e.printStackTrace();}
        
        return false;
    }
    
    public boolean editEmployee (int chosenEmployeeID, RegularEmployee employee) {      
        try (Connection con = DatabaseConnection.Connect()) {
             String query = "UPDATE users SET First_Name = ?, Last_Name = ?, Address = ?, Birthdate = ?, Position = ?, Phone_number = ?, SSS = ?, Philhealth = ?, TIN = ?, Pagibig = ?, Status = ?, Hourly_Rate = ?, Role = ? "
                          + "WHERE id = ?";
             PreparedStatement ptst = con.prepareStatement(query);
             ptst.setString(1,  employee.getFirstName()); // first name
             ptst.setString(2,  employee.getLastName()); // last name
             ptst.setString(3,  employee.getAddress()); // address
             ptst.setString(4,  employee.getBirthday()); // Birthdate
             ptst.setString(5,  employee.getPosition()); // Position
             ptst.setString(6,  employee.getPhoneNumber()); // Phone_number
             ptst.setString(7,  employee.getSSSNumber()); // SSS
             ptst.setString(8,  employee.getPhilhealthNumber()); // Philhealth
             ptst.setString(9,  employee.getTinNumber()); // TIN
             ptst.setString(10, employee.getPagibigNumber()); // Pagibig
             ptst.setString(11, employee.getStatus()); // Status
             ptst.setDouble(12, employee.getHourlyRate()); // Hourly_Rate
             ptst.setString(13, employee.getRole()); // Role
             ptst.setInt(14,    chosenEmployeeID);
             ptst.executeUpdate();
             
             return true;
             
        } catch (Exception e) {e.printStackTrace();}
        
        return false;
    }
    
    public boolean deleteEmployee (int employeeId) {
        try (Connection con = DatabaseConnection.Connect()) {
             String query = "DELETE FROM users WHERE id = ?";
             PreparedStatement ptst = con.prepareStatement(query);
             ptst.setInt(1, employeeId);
             ptst.execute();
             
             return true;
             
        } catch (Exception e) {e.printStackTrace();}
        
        return false;
    }      
}

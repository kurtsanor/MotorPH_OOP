package oopClasses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


// CRUD operations for employee management
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
    
    // gets the full information of the chosen employee
    public String [] getEmployeeInformation (int chosenEmployeeId) {
        String [] employeeInfo = new String [2];
        try (Connection con = DatabaseConnection.Connect()) {
            String query = "SELECT * FROM users WHERE id = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, chosenEmployeeId);
            ResultSet rs = st.executeQuery();
                
            if (rs.next()) {
            employeeInfo[0] = ("<html>" +
            "<table cellspacing='1' cellpadding='1' style='line-height:1.2;'>" +
            "  <tr><td><b>Emp ID</b></td><td>&nbsp:&nbsp&nbsp </td><td>" + rs.getString("id") + " </td></tr>" +
            "  <tr><td><b>Position</b></td><td>&nbsp:&nbsp&nbsp </td><td>" + rs.getString("Position") + " </td></tr>" +
            "  <tr><td><b>Address</b></td><td>&nbsp:&nbsp&nbsp </td><td>" + rs.getString("Address") + " </td></tr>" +
            "  <tr><td><b>Birthday</b></td><td>&nbsp:&nbsp&nbsp </td><td>" + rs.getString("Birthdate") + " </td></tr>" +
            "  <tr><td><b>Status</b></td><td>&nbsp:</td><td>" + rs.getString("Status") + " </td></tr>" +
            "  <tr><td><b>Phone</b></td><td>&nbsp:</td><td>" + rs.getString("Phone_number") + " </td></tr>" +
            "  <tr><td><b>SSS</b></td><td>&nbsp:</td><td>" + rs.getString("SSS") + " </td></tr>" +
            "  <tr><td><b>Philhealth</b></td><td>&nbsp:</td><td>" + rs.getString("Philhealth") + " </td></tr>" +
            "  <tr><td><b>PAG-IBIG</b></td><td>&nbsp:</td><td>" + rs.getString("Pagibig") + " </td></tr>" +
            "  <tr><td><b>TIN</b></td><td>&nbsp:</td><td>" + rs.getString("TIN") + " </td></tr>" +
            "  <tr><td><b>Hourly Rate</b></td><td>&nbsp:</td><td>" + rs.getString("Hourly_rate") + " </td></tr>" +
            "</table>" +
            "</html>");           
            
            employeeInfo[1] = rs.getString("First_Name") +" "+ rs.getString("Last_Name");         
            }                          
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return employeeInfo;
    }
    
    public String [] getEmployeeDetails (int chosenEmployeeId) {       
        String [] employeeDetails = new String[14];
        
        try (Connection con = DatabaseConnection.Connect()) {
             String query = "SELECT * FROM users WHERE id = ?";
             PreparedStatement ptst = con.prepareStatement(query);
             ptst.setInt(1, chosenEmployeeId);
             ResultSet rs = ptst.executeQuery();
             
             if (rs.next()) {
                 employeeDetails[0] = (rs.getString("id"));
                 employeeDetails[1] = (rs.getString("First_Name"));
                 employeeDetails[2] = (rs.getString("Last_Name"));
                 employeeDetails[3] = (rs.getString("Birthdate"));
                 employeeDetails[4] = (rs.getString("Phone_number"));     
                 employeeDetails[5] = (rs.getString("address"));
                 employeeDetails[6] = (rs.getString("Status"));
                 employeeDetails[7] = (rs.getString("Position"));
                 employeeDetails[8] = (rs.getString("Hourly_Rate"));
                 employeeDetails[9] = (rs.getString("Role"));
                 employeeDetails[10] = (rs.getString("SSS"));
                 employeeDetails[11] = (rs.getString("Philhealth"));
                 employeeDetails[12] = (rs.getString("Pagibig"));
                 employeeDetails[13] = (rs.getString("TIN"));   
             }
                                   
        } catch (Exception e) {e.printStackTrace();}
        
        return employeeDetails;
    }
        
    public boolean addEmployee (String [] employeeData) {                            
        try (Connection con = DatabaseConnection.Connect()) {
             String query = "INSERT INTO users (First_Name, Last_Name, Address, Birthdate, Position, Phone_number, SSS, Philhealth, TIN, Pagibig, Status, Hourly_Rate, Role) "
                          + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)"; 
             
             PreparedStatement ptst = con.prepareStatement(query);
             ptst.setString(1,  employeeData[0]); // first name
             ptst.setString(2,  employeeData[1]); // last name
             ptst.setString(3,  employeeData[2]); // address
             ptst.setString(4,  employeeData[3]); // Birthdate
             ptst.setString(5,  employeeData[4]); // Position
             ptst.setString(6,  employeeData[5]); // Phone_number
             ptst.setString(7,  employeeData[6]); // SSS
             ptst.setString(8,  employeeData[7]); // Philhealth
             ptst.setString(9,  employeeData[8]); // TIN
             ptst.setString(10, employeeData[9]); // Pagibig
             ptst.setString(11, employeeData[10]); // Status
             ptst.setDouble(12, Double.parseDouble(employeeData[11])); // Hourly_Rate
             ptst.setString(13, employeeData[12]); // Role
             ptst.executeUpdate();
             
             return true;
             
        } catch (Exception e) {e.printStackTrace();}
        
        return false;
    }
    
    public boolean editEmployee (int chosenEmployeeID, String [] employeeData) {      
        try (Connection con = DatabaseConnection.Connect()) {
             String query = "UPDATE users SET First_Name = ?, Last_Name = ?, Address = ?, Birthdate = ?, Position = ?, Phone_number = ?, SSS = ?, Philhealth = ?, TIN = ?, Pagibig = ?, Status = ?, Hourly_Rate = ?, Role = ? "
                          + "WHERE id = ?";
             PreparedStatement ptst = con.prepareStatement(query);
             ptst.setString(1,  employeeData[0]); // first name
             ptst.setString(2,  employeeData[1]); // last name
             ptst.setString(3,  employeeData[2]); // address
             ptst.setString(4,  employeeData[3]); // Birthdate
             ptst.setString(5,  employeeData[4]); // Position
             ptst.setString(6,  employeeData[5]); // Phone_number
             ptst.setString(7,  employeeData[6]); // SSS
             ptst.setString(8,  employeeData[7]); // Philhealth
             ptst.setString(9,  employeeData[8]); // TIN
             ptst.setString(10, employeeData[9]); // Pagibig
             ptst.setString(11, employeeData[10]); // Status
             ptst.setDouble(12, Double.parseDouble(employeeData[11])); // Hourly_Rate
             ptst.setString(13, employeeData[12]); // Role
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

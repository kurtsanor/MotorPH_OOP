
package oopClasses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LeaveManagementModule implements RecordOperations {
    
    private User user;

    public LeaveManagementModule(User user) {
        this.user = user;
    }
       
    // Retrieves all leave requests from the database for HR to approve or deny
    @Override
    public List <String []> getAllRecords () {
        List <String []> leaveRecords = new ArrayList<>();
        
        try (Connection con = DatabaseConnection.Connect()) {
             String query = "SELECT * FROM leave_requests";
             PreparedStatement ptst = con.prepareStatement(query);
             ResultSet rs = ptst.executeQuery();             
                        
             while (rs.next()) {
                 leaveRecords.add(new String [] {
                  rs.getString("Request_number"),
                  rs.getString("id"),
                  rs.getString("First_name") + " " + rs.getString("Last_name"),
                  rs.getString("Leave_type"),
                  rs.getString("status")} );
             }
                                  
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return leaveRecords;
    }
        
    // loads only the leave records of the logged in employee    
    public List <String []> getAllRecords (int employeeID) {
        List <String []> leaveRecords = new ArrayList<>();
        
        try (Connection con = DatabaseConnection.Connect()) {
             String query = "SELECT * FROM leave_requests WHERE id = ?";
             PreparedStatement ptst = con.prepareStatement(query);
             ptst.setInt(1, user.getId());
             ResultSet rs = ptst.executeQuery();
                                     
             while (rs.next()) {
                 leaveRecords.add(new String [] 
                 {rs.getString("Request_number"),
                  rs.getString("Start_date"),
                  rs.getString("End_date"),
                  rs.getString("Leave_type"),
                  rs.getString("status")} );
             }
                                  
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return leaveRecords;
    }
    
    // Searches for leave records based on employee ID or name   
    @Override
    public List <String []> search (String searchInput) {
        List <String []> searchResults = new ArrayList<>();
        
        try (Connection con = DatabaseConnection.Connect()) {
            String query = "SELECT * FROM leave_requests WHERE id LIKE ? OR LOWER(CONCAT(First_name, ' ', Last_name)) LIKE ?";
            PreparedStatement ptst = con.prepareStatement(query);
            String searchPattern = "%" + searchInput.toLowerCase() + "%";
            ptst.setString(1, searchPattern);
            ptst.setString(2, searchPattern);
            ResultSet rs = ptst.executeQuery();
                       
            while (rs.next()) {              
                searchResults.add(new String[]{
                rs.getString("Request_number"),
                rs.getString("id"),
                rs.getString("First_name") + " " + rs.getString("Last_name"),
                rs.getString("Leave_type"),
                rs.getString("status")});         
            }
                                                        
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return searchResults;
    }
    
    
    // Filters leave records based on status (All, Pending, Approved, Denied)
    public List <String []> filterRecords (String filter, String searchInput) {
        // if input is equal to the textbox placeholder, clear it
        if (searchInput.equals("Search")) searchInput = "";
        
        List <String []> filteredResults = new ArrayList<>();
        
        try (Connection con = DatabaseConnection.Connect()) {
            String query;
            if (filter.equals("All")) {
                query = "SELECT * FROM leave_requests WHERE id LIKE ? OR LOWER(CONCAT(First_name, ' ', Last_name)) LIKE ?";
            } else {
                query = "SELECT * FROM leave_requests WHERE status = ? AND (id LIKE ? OR LOWER(CONCAT(First_name, ' ', Last_name)) LIKE ?)";
            }
            PreparedStatement ptst = con.prepareStatement(query);   
            String searchPattern = "%" + searchInput.toLowerCase() + "%";
            
            if (!filter.equals("All")) {
                ptst.setString(1, filter);
                ptst.setString(2, searchPattern);
                ptst.setString(3, searchPattern);              
            } else {
                ptst.setString(1, searchPattern);
                ptst.setString(2, searchPattern);
            }
            
            ResultSet rs = ptst.executeQuery();              
                         
             while (rs.next()) {               
                filteredResults.add(new String [] {
                rs.getString("Request_number"),
                rs.getString("id"),
                rs.getString("First_name") + " " + rs.getString("Last_name"),
                rs.getString("Leave_type"),
                rs.getString("status")} );                             
             }                                 
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return filteredResults;
    }    
    
    // search employee and their leave records by filtering status
    public List <String []> search (String searchInput, String filter) {
        List <String []> searchResults = new ArrayList<>();
        
        try (Connection con = DatabaseConnection.Connect()) {
            String query = "SELECT * FROM leave_requests WHERE status = ? AND (id LIKE ? OR LOWER(CONCAT(First_name, ' ', Last_name)) LIKE ?)";
            PreparedStatement ptst = con.prepareStatement(query);
            String searchPattern = "%" + searchInput.toLowerCase() + "%";
            ptst.setString(1, filter);
            ptst.setString(2, searchPattern);
            ptst.setString(3, searchPattern);
            
            ResultSet rs = ptst.executeQuery();
                      
            while (rs.next()) {           
                searchResults.add(new String[]{
                rs.getString("Request_number"),
                rs.getString("id"),
                rs.getString("First_name") + " " + rs.getString("Last_name"),
                rs.getString("Leave_type"),
                rs.getString("status")});               
            }
                                                        
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return searchResults;
    }
    
    // gets detailed information about a leave request
    public String [] getLeaveDetails (int requestID) {
        String [] leaveDetails = new String [5];
        
        try (Connection con = DatabaseConnection.Connect()) {
            String query = "SELECT * FROM leave_requests WHERE Request_number = ?";
            PreparedStatement ptst = con.prepareStatement(query);
            ptst.setInt(1, requestID);
            ResultSet rs = ptst.executeQuery();
             
            if (rs.next()) {               
                leaveDetails[0] = rs.getString("First_name") + " " + rs.getString("Last_name");
                leaveDetails[1] = rs.getString("Start_date");
                leaveDetails[2] = rs.getString("End_date");
                leaveDetails[3] = rs.getString("Leave_type");
                leaveDetails[4] = rs.getString("Reason");                            
            }
                               
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return leaveDetails;
    }
    
    public boolean submitLeaveRequest (int senderId, String startDate, String endDate, String Reason,
                                    String firstName, String lastName, String leaveType, String status) {       
        
        try (Connection con = DatabaseConnection.Connect()) {
            String query = "INSERT INTO leave_requests "
                         + "(id, Start_date, End_date, Reason, First_name, Last_name, Leave_type, status) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement ptst = con.prepareStatement(query);
            ptst.setInt(1, senderId);
            ptst.setString(2, startDate);
            ptst.setString(3, endDate);
            ptst.setString(4, Reason);
            ptst.setString(5, firstName);
            ptst.setString(6, lastName);
            ptst.setString(7, leaveType);
            ptst.setString(8, "Pending");
            
            ptst.executeUpdate();
            
            return true;
                                                                  
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
        
    public boolean approveLeave (int reqNumber) {
        try (Connection con = DatabaseConnection.Connect()) {
             String query = "UPDATE leave_requests SET status = ? WHERE request_number = ?";
             PreparedStatement ptst = con.prepareStatement(query);
             ptst.setString(1, "Approved");
             ptst.setInt(2, reqNumber);
             ptst.executeUpdate();
             
             return true;
                                             
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public boolean denyLeave (int reqNumber) {
        try (Connection con = DatabaseConnection.Connect()) {
             String query = "UPDATE leave_requests SET status = ? WHERE request_number = ?";
             PreparedStatement ptst = con.prepareStatement(query);
             ptst.setString(1, "Denied");
             ptst.setInt(2, reqNumber);
             ptst.executeUpdate();
             
             return true;
                                             
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
}

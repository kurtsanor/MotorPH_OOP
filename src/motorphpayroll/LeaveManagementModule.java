
package motorphpayroll;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



public class LeaveManagementModule implements RecordOperations {
    
    private User user;
  
    public LeaveManagementModule(User user) {
        this.user = user;
    }
    
    
    // loads the leave records of the logged in employee
    @Override
    public void loadTable (JTable table) {
        try (Connection con = DatabaseConnection.Connect()) {
             String query = "SELECT * FROM leave_requests WHERE id = ?";
             PreparedStatement ptst = con.prepareStatement(query);
             ptst.setInt(1, user.getId());
             ResultSet rs = ptst.executeQuery();
            
             DefaultTableModel tablemodel = (DefaultTableModel)table.getModel();
             tablemodel.setRowCount(0);
             
             
             while (rs.next()) {
                 tablemodel.addRow(new Object [] 
                 {rs.getInt("Request_number"),
                  rs.getString("Start_date"),
                  rs.getString("End_date"),
                  rs.getString("Leave_type"),
                  rs.getString("status")} );
             }
                                  
        } catch (Exception e) {System.out.println(e);}
    }
    
    // loads all the leave requests of all employees for HR to approve or deny
    public void loadTable (JTable table, boolean allEmployees) {
        try (Connection con = DatabaseConnection.Connect()) {
             String query = "SELECT * FROM leave_requests";
             PreparedStatement ptst = con.prepareStatement(query);
             ResultSet rs = ptst.executeQuery();             
             
             DefaultTableModel tablemodel = (DefaultTableModel)table.getModel();
             tablemodel.setRowCount(0);
             
             while (rs.next()) {
                 tablemodel.addRow(new Object [] 
                 {rs.getInt("Request_number"),
                  rs.getInt("id"),
                  rs.getString("First_name") + " " + rs.getString("Last_name"),
                  rs.getString("Leave_type"),
                  rs.getString("status")} );
             }
                                  
        } catch (Exception e) {System.out.println(e);}
    }
    
    // used by the filter combox to filter table (All, Pending, Approved, Denied)
    public void loadTable (JTable table, String status, String identifier) {
        try (Connection con = DatabaseConnection.Connect()) {
             String query;
             switch (status) {
                 case "All" -> query = "SELECT * FROM leave_requests";
                 default -> query = "SELECT * FROM leave_requests WHERE status = ?";
             }
             PreparedStatement ptst = con.prepareStatement(query);   
             
             if (!status.equals("All")) ptst.setString(1, status);             
             ResultSet rs = ptst.executeQuery();              
             
             DefaultTableModel tablemodel = (DefaultTableModel)table.getModel();
             tablemodel.setRowCount(0);
             
             while (rs.next()) {
                 if (identifier.equals("Search")) identifier = "";
                 if (rs.getString("id").contains(identifier) ||
                    rs.getString("Last_Name").toLowerCase().contains(identifier.toLowerCase()) ||
                    rs.getString("First_Name").toLowerCase().contains(identifier.toLowerCase())) 
                {
                    tablemodel.addRow(new Object [] {
                    rs.getInt("Request_number"),
                    rs.getInt("id"),
                    rs.getString("First_name") + " " + rs.getString("Last_name"),
                    rs.getString("Leave_type"),
                    rs.getString("status")} );
                }
                  
             }
                                  
        } catch (Exception e) {System.out.println(e);}
    }
    
    @Override
    public void search (JTable table, String identifier) {
        try (Connection con = DatabaseConnection.Connect()) {
            String query = "SELECT * FROM leave_requests;";
            PreparedStatement ptst = con.prepareStatement(query);
            ResultSet rs = ptst.executeQuery();
            
            DefaultTableModel tablemodel = (DefaultTableModel)table.getModel();
            tablemodel.setRowCount(0);
            
            while (rs.next()) {
                if (rs.getString("id").contains(identifier.toLowerCase()) || 
                    rs.getString("First_name").toLowerCase().contains(identifier.toLowerCase()) ||
                    rs.getString("Last_name").toLowerCase().contains(identifier.toLowerCase())) 
                {
                    tablemodel.addRow(new Object[]{
                    rs.getInt("Request_number"),
                    rs.getInt("id"),
                    rs.getString("First_name") + " " + rs.getString("Last_name"),
                    rs.getString("Leave_type"),
                    rs.getString("status")});
                }
            }
                                                        
        } catch (Exception e) {System.out.println(e);}
    }
    
    // search employee and their leave records by filtering status
    public void search (JTable table, String identifier, String filter) {
        try (Connection con = DatabaseConnection.Connect()) {
            String query = "SELECT * FROM leave_requests WHERE status = ?;";
            PreparedStatement ptst = con.prepareStatement(query);
            ptst.setString(1, filter);
            ResultSet rs = ptst.executeQuery();
            
            DefaultTableModel tablemodel = (DefaultTableModel)table.getModel();
            tablemodel.setRowCount(0);
            
            while (rs.next()) {
                if ((rs.getString("id").contains(identifier.toLowerCase()) && rs.getString("status").equals(filter)) || 
                    (rs.getString("First_name").toLowerCase().contains(identifier.toLowerCase()) && rs.getString("status").equals(filter)) ||
                    (rs.getString("Last_name").toLowerCase().contains(identifier.toLowerCase())) && rs.getString("status").equals(filter)) 
                {
                    tablemodel.addRow(new Object[]{
                    rs.getInt("Request_number"),
                    rs.getInt("id"),
                    rs.getString("First_name") + " " + rs.getString("Last_name"),
                    rs.getString("Leave_type"),
                    rs.getString("status")});
                }
            }
                                                        
        } catch (Exception e) {System.out.println(e);}
    }
    
    public void submitLeaveRequest (int senderId, String startDate, String endDate, String Reason,
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
            
            JOptionPane.showMessageDialog(null, "Request Sent");
                                                                  
        } catch (Exception e) {System.out.println(e);}
    }
    
    @Override
    public void fillDetails (int requestID, JTextField empName, JTextField startDate, JTextField endDate, JTextField leaveType, JTextField reason) {
        try (Connection con = DatabaseConnection.Connect()) {
             String query = "SELECT * FROM leave_requests WHERE Request_number = ?";
             PreparedStatement ptst = con.prepareStatement(query);
             ptst.setInt(1, requestID);
             ResultSet rs = ptst.executeQuery();
             
             if (rs.next()) {
                empName.setText(rs.getString("First_name") + " " + rs.getString("Last_name"));
                startDate.setText(rs.getString("Start_date"));
                endDate.setText(rs.getString("End_date"));
                leaveType.setText(rs.getString("Leave_type"));
                reason.setText(rs.getString("Reason")); 
             }
             
                      
        } catch (Exception e) {e.printStackTrace();}
    }
    
    public void approveLeave (int reqNumber) {
        try (Connection con = DatabaseConnection.Connect()) {
             String query = "UPDATE leave_requests SET status = ? WHERE request_number = ?";
             PreparedStatement ptst = con.prepareStatement(query);
             ptst.setString(1, "Approved");
             ptst.setInt(2, reqNumber);
             ptst.executeUpdate();
             
             JOptionPane.showMessageDialog(null, "Leave Approved");
                                             
        } catch (Exception e) {e.printStackTrace();}
    }
    
    public void denyLeave (int reqNumber) {
        try (Connection con = DatabaseConnection.Connect()) {
             String query = "UPDATE leave_requests SET status = ? WHERE request_number = ?";
             PreparedStatement ptst = con.prepareStatement(query);
             ptst.setString(1, "Denied");
             ptst.setInt(2, reqNumber);
             ptst.executeUpdate();
             
             JOptionPane.showMessageDialog(null, "Leave Denied");
                                             
        } catch (Exception e) {e.printStackTrace();}
    }
}

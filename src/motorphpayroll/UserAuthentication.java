package motorphpayroll;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserAuthentication  {
    
    private String username;
    private String password;
    
    public UserAuthentication (String username, String password) {
        this.username = username;
        this.password = password;
    }
                   
    public int authenticateUser () {
        try (Connection con = DatabaseConnection.Connect()) {
            String query = "SELECT employeeID FROM credentials WHERE BINARY username = ? AND password = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                int employeeID = rs.getInt("employeeID");
                return employeeID; // return employee id if credentials are correct to be used for identifying user role
            }
                      
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        return -1; // return -1 if the credentials is incorrect
    }
    
    
    
    public User getUserRole (int employeeID) {
        try (Connection con = DatabaseConnection.Connect()) {
            String query = "SELECT * FROM users WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, employeeID);
            ResultSet rs = pst.executeQuery();
            
            User user = null;
            
            if (rs.next()) {
                String role = rs.getString("Role");
                switch (role) {
                    case "IT":
                        user = new IT(
                        rs.getInt("id"),
                        rs.getString("First_Name"),    
                        rs.getString("Last_Name"),
                        rs.getString("Position"),   
                        rs.getString("Status"),     
                        rs.getString("Birthdate"),
                        rs.getString("Address"),
                        rs.getString("Phone_number"),
                        rs.getString("Philhealth"),
                        rs.getString("SSS"),    
                        rs.getString("Pagibig"),
                        rs.getString("TIN"),
                        rs.getDouble("Hourly_rate"),
                        rs.getString("Role"));                                                               
                        break;
                    case "Finance":
                        user = new Finance(
                        rs.getInt("id"),
                        rs.getString("First_Name"),    
                        rs.getString("Last_Name"),
                        rs.getString("Position"),   
                        rs.getString("Status"),     
                        rs.getString("Birthdate"),
                        rs.getString("Address"),
                        rs.getString("Phone_number"),
                        rs.getString("Philhealth"),
                        rs.getString("SSS"),    
                        rs.getString("Pagibig"),
                        rs.getString("TIN"),
                        rs.getDouble("Hourly_rate"),
                        rs.getString("Role"));
                        break;
                    case "HR":
                        user = new HR(
                        rs.getInt("id"),
                        rs.getString("First_Name"),    
                        rs.getString("Last_Name"),
                        rs.getString("Position"),   
                        rs.getString("Status"),     
                        rs.getString("Birthdate"),
                        rs.getString("Address"),
                        rs.getString("Phone_number"),
                        rs.getString("Philhealth"),
                        rs.getString("SSS"),    
                        rs.getString("Pagibig"),
                        rs.getString("TIN"),
                        rs.getDouble("Hourly_rate"),
                        rs.getString("Role"));
                        break;
                    default:
                        user = new RegularEmployee(
                        rs.getInt("id"),
                        rs.getString("First_Name"),    
                        rs.getString("Last_Name"),
                        rs.getString("Position"),   
                        rs.getString("Status"),     
                        rs.getString("Birthdate"),
                        rs.getString("Address"),
                        rs.getString("Phone_number"),
                        rs.getString("Philhealth"),
                        rs.getString("SSS"),    
                        rs.getString("Pagibig"),
                        rs.getString("TIN"),
                        rs.getDouble("Hourly_rate"),
                        rs.getString("Role"));                                           
                }
            }
            
            return user;
            
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }
    
    
    
    
    
    
        
    
}

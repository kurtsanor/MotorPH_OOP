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
          
    public boolean Login () {
        try (Connection con = DatabaseConnection.Connect()) {          
            String query = "SELECT * FROM credentials WHERE BINARY username = ? and password = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
                int empID = rs.getInt("employeeID");   
                
                String empQuery = "SELECT * FROM users WHERE id = ?";
                PreparedStatement empPst = con.prepareStatement(empQuery);
                empPst.setInt(1, empID);
                ResultSet empRs = empPst.executeQuery();
                
                
                if (empRs.next()) {
                User user = null;
                switch (empRs.getString("Role")) {
                    case "IT":
                        user = new IT(
                        empRs.getInt("id"),
                        empRs.getString("First_Name"),    
                        empRs.getString("Last_Name"),
                        empRs.getString("Position"),   
                        empRs.getString("Status"),     
                        empRs.getString("Birthdate"),
                        empRs.getString("Address"),
                        empRs.getString("Phone_number"),
                        empRs.getString("Philhealth"),
                        empRs.getString("SSS"),    
                        empRs.getString("Pagibig"),
                        empRs.getString("TIN"),
                        empRs.getDouble("Hourly_rate"),
                        empRs.getString("Role"));                                                               
                        break;
                    case "Finance":
                        user = new Finance(
                        empRs.getInt("id"),
                        empRs.getString("First_Name"),    
                        empRs.getString("Last_Name"),
                        empRs.getString("Position"),   
                        empRs.getString("Status"),     
                        empRs.getString("Birthdate"),
                        empRs.getString("Address"),
                        empRs.getString("Phone_number"),
                        empRs.getString("Philhealth"),
                        empRs.getString("SSS"),    
                        empRs.getString("Pagibig"),
                        empRs.getString("TIN"),
                        empRs.getDouble("Hourly_rate"),
                        empRs.getString("Role"));
                        break;
                    case "HR":
                        user = new HR(
                        empRs.getInt("id"),
                        empRs.getString("First_Name"),    
                        empRs.getString("Last_Name"),
                        empRs.getString("Position"),   
                        empRs.getString("Status"),     
                        empRs.getString("Birthdate"),
                        empRs.getString("Address"),
                        empRs.getString("Phone_number"),
                        empRs.getString("Philhealth"),
                        empRs.getString("SSS"),    
                        empRs.getString("Pagibig"),
                        empRs.getString("TIN"),
                        empRs.getDouble("Hourly_rate"),
                        empRs.getString("Role"));
                        break;
                    default:
                        user = new RegularEmployee(
                        empRs.getInt("id"),
                        empRs.getString("First_Name"),    
                        empRs.getString("Last_Name"),
                        empRs.getString("Position"),   
                        empRs.getString("Status"),     
                        empRs.getString("Birthdate"),
                        empRs.getString("Address"),
                        empRs.getString("Phone_number"),
                        empRs.getString("Philhealth"),
                        empRs.getString("SSS"),    
                        empRs.getString("Pagibig"),
                        empRs.getString("TIN"),
                        empRs.getDouble("Hourly_rate"),
                        empRs.getString("Role"));                                           
                }
                
                    new HomePageGui(user).setVisible(true); return true;             
                }
            }
                                                                              
        } catch (Exception e){
            System.out.println(e);
        }
                   
        return false;
    }
    
    public void logOut (HomePageGui frame) {
        frame.dispose();
        new LoginGui().setVisible(true);
    }
    
    public int authenticateUser (String username, String password) {
        try (Connection con = DatabaseConnection.Connect()) {
            String query = "SELECT * FROM credentials WHERE BINARY username = ? AND password = ?";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                int employeeID = rs.getInt("employeeID");
                return employeeID;
            }
                      
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        return -1; // return -1 if the credentials is incorrect
    }
    
    
    
    public User getUserRole () {
        try (Connection con = DatabaseConnection.Connect()) {
            String query = "SELECT * FROM credentials WHERE BINARY username = ? AND password = ?";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                
            }
            
            
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }
    
    
    
    
    
    
        
    
}

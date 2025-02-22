package motorphpayroll;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class UserAuthentication  {
    
    public UserAuthentication () {}
          
    public boolean Login (String username, String password) {
        try (Connection con = DatabaseConnection.Connect()) {          
            String query = "SELECT * FROM users WHERE BINARY Username = ? and Password = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
                User user = null;
                switch (rs.getString("Role")) {
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
                
                new HomePageGui(user).setVisible(true); return true;             
            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid usermname or password","Wrong Credentials", JOptionPane.ERROR_MESSAGE);               
            }
                     
        } catch (Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e, "Error" , JOptionPane.ERROR_MESSAGE);
        }
        
            
        return false;
    }
    
    public void logOut (HomePageGui frame) {
        frame.dispose();
        new LoginGui().setVisible(true);
    }
    
    
    
    
    
    
    
    
        
    
}

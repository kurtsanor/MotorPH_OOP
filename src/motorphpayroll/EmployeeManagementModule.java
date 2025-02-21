
package motorphpayroll;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

// CRUD operations for employee management
public class EmployeeManagementModule implements RecordOperations {
    
    public EmployeeManagementModule () {
        
    }

    // loads the table with all the employee records
    @Override
    public void loadTable (JTable table) {
        try (Connection con = DatabaseConnection.Connect()) {
            String query = "SELECT * FROM users";
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            
            DefaultTableModel tablemodel = (DefaultTableModel)table.getModel();
            tablemodel.setRowCount(0);
            
            while (rs.next()) {
                tablemodel.addRow(new Object[]{rs.getString("id"),
                    rs.getString("Last_Name"),
                    rs.getString("First_Name")
                });
            }                     
        } catch (Exception e) {}
    }
    
    // searches existing employees
    @Override
    public void search (JTable table, String identifier) {
        try (Connection con = DatabaseConnection.Connect()) {
            String query = "SELECT * FROM users";
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            
            // reset the table
            DefaultTableModel tablemodel = (DefaultTableModel)table.getModel();            
            tablemodel.setRowCount(0);
            
            while (rs.next()) {
                if (rs.getString("id").contains(identifier) ||
                    rs.getString("Last_Name").toLowerCase().contains(identifier.toLowerCase()) ||
                    rs.getString("First_Name").toLowerCase().contains(identifier.toLowerCase())) 
                {
                    tablemodel.addRow(new Object[]{rs.getString("id"),
                    rs.getString("Last_Name"),
                    rs.getString("First_Name")
                });
                }
            }
            
                                 
        } catch (Exception e) {e.printStackTrace();}
    }
    
    // displays the full information of the chosen employee
    public void viewEmployee (int chosenEmployeeId, JLabel details, JLabel fullName){
        try (Connection con = DatabaseConnection.Connect()) {
            String query = "SELECT * FROM users WHERE id = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, chosenEmployeeId);
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
            String text = ("<html>" +
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
            details.setText(text);
            fullName.setText(rs.getString("First_Name") +" "+ rs.getString("Last_Name"));
            }
            
            
                                 
        } catch (Exception e) {e.printStackTrace();}
    }
    
    // When the edit button is clicked, this will fill the textfields with the details of the chosen employee
    @Override
    public void fillDetails (int employeeId, JTextField firstName, JTextField lastName, JTextField birthday, JTextField phone, JTextField address) {
        try (Connection con = DatabaseConnection.Connect()) {
             String query = "SELECT * FROM users WHERE id = ?";
             PreparedStatement ptst = con.prepareStatement(query);
             ptst.setInt(1, employeeId);
             ResultSet rs = ptst.executeQuery();
             
             if (rs.next()) {
                 firstName.setText(rs.getString("First_Name"));
                 lastName.setText(rs.getString("Last_Name"));
                 birthday.setText(rs.getString("Birthdate"));
                 phone.setText(rs.getString("Phone_number"));     
                 address.setText(rs.getString("address"));
             }
                                   
        } catch (Exception e) {e.printStackTrace();}
    }
    
    // When the edit button is clicked, this will fill the textfields with the details of the chosen employee
    public void fillDetails (int employeeId, JTextField status, JTextField position, JTextField hourlyRate, JTextField role, JTextField SSS, JTextField philhealth, JTextField pagibig, JTextField TIN) {
        try (Connection con = DatabaseConnection.Connect()) {
             String query = "SELECT * FROM users WHERE id = ?";
             PreparedStatement ptst = con.prepareStatement(query);
             ptst.setInt(1, employeeId);
             ResultSet rs = ptst.executeQuery();
             
             if (rs.next()) {                
                 status.setText(rs.getString("Status"));
                 position.setText(rs.getString("Position"));
                 hourlyRate.setText(rs.getString("Hourly_Rate"));
                 role.setText(rs.getString("Role"));
                 SSS.setText(rs.getString("SSS"));
                 philhealth.setText(rs.getString("Philhealth"));
                 pagibig.setText(rs.getString("Pagibig"));
                 TIN.setText(rs.getString("TIN"));                                           
             }
                                   
        } catch (Exception e) {e.printStackTrace();}
    }
    
    // displays the info of the logged in employee in the home page
    public void fillDetails (User user, JLabel info1, JLabel info2) {
        String text = ("<html>" +
            "<table cellspacing='2' cellpadding='2' style='line-height:1.2;'>" +
            "  <tr><td><b>Name</b></td><td>&nbsp:&nbsp&nbsp </td><td>" + user.getFirstName()+ " " + user.getLastName() + " </td></tr>" +
            "  <tr><td><b>Employee ID</b></td><td>&nbsp:</td><td>" + user.getId()+ " </td></tr>" +
            "  <tr><td><b>Job Position</b></td><td>&nbsp:</td><td>" + user.getPosition()+ " </td></tr>" +
            "  <tr><td><b>Department</b></td><td>&nbsp:</td><td>" + user.getAddress()+ " </td></tr>" +
            "</table>" +
            "</html>");
        info1.setText(text);
        
        String textII = ("<html>" +
            "<table cellspacing='1' cellpadding='1' style='line-height:1.2;'>" +
            "  <tr><td><b>Birthday</b></td><td>&nbsp:&nbsp&nbsp </td><td>" + user.getBirthday() + " </td></tr>" +
            "  <tr><td><b>Status</b></td><td>&nbsp:</td><td>" + user.getStatus() + " </td></tr>" +
            "  <tr><td><b>Phone</b></td><td>&nbsp:</td><td>" + user.getPhoneNumber() + " </td></tr>" +
            "  <tr><td><b>SSS</b></td><td>&nbsp:</td><td>" + user.getSSSNumber() + " </td></tr>" +
            "  <tr><td><b>Philhealth</b></td><td>&nbsp:</td><td>" + user.getPhilhealthNumber()+ " </td></tr>" +
            "  <tr><td><b>PAG-IBIG</b></td><td>&nbsp:</td><td>" + user.getPagibigNumber() + " </td></tr>" +
            "  <tr><td><b>TIN</b></td><td>&nbsp:</td><td>" + user.getTinNumber() + " </td></tr>" +
            "  <tr><td><b>Hourly Rate</b></td><td>&nbsp:</td><td>" + user.getHourlyRate() + " </td></tr>" +
            "</table>" +
            "</html>");
        info2.setText(textII);
    }
    
    
    public void addEmployee (JTextField firstName, JTextField lastName, JTextField birthday, JTextField phone, JTextField address, JTextField status, JTextField position,
                             JTextField hourlyRate, JTextField role, JTextField SSS, JTextField philhealth, JTextField pagibig, JTextField TIN) {
                             
        try (Connection con = DatabaseConnection.Connect()) {
             String query = "INSERT INTO users (First_Name, Last_Name, Address, Birthdate, Position, Phone_number, SSS, Philhealth, TIN, Pagibig, Status, Hourly_Rate, Role) "
                          + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)"; 
             PreparedStatement ptst = con.prepareStatement(query);
             ptst.setString(1,  firstName.getText());
             ptst.setString(2,  lastName.getText());
             ptst.setString(3,  address.getText());
             ptst.setString(4,  birthday.getText());
             ptst.setString(5,  position.getText());
             ptst.setString(6,  phone.getText());
             ptst.setString(7,  SSS.getText());
             ptst.setString(8,  philhealth.getText());
             ptst.setString(9,  TIN.getText());
             ptst.setString(10, pagibig.getText());
             ptst.setString(11, status.getText());
             ptst.setDouble(12, Double.parseDouble(hourlyRate.getText()));
             ptst.setString(13, role.getText());
             ptst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Added Successfully");
             
        } catch (Exception e) {e.printStackTrace();}
    }
    
    public void editEmployee (int EmployeeId, JTextField firstName, JTextField lastName, JTextField birthday, JTextField phone, JTextField address, JTextField status, JTextField position,
                               JTextField hourlyRate, JTextField role, JTextField SSS, JTextField philhealth, JTextField pagibig, JTextField TIN) {
        
        try (Connection con = DatabaseConnection.Connect()) {
             String query = "UPDATE users SET First_Name = ?, Last_Name = ?, Address = ?, Birthdate = ?, Position = ?, Phone_number = ?, SSS = ?, Philhealth = ?, TIN = ?, Pagibig = ?, Status = ?, Hourly_Rate = ?, Role = ? "
                          + "WHERE id = ?";
             PreparedStatement ptst = con.prepareStatement(query);
             ptst.setString(1,  firstName.getText());
             ptst.setString(2,  lastName.getText());
             ptst.setString(3,  address.getText());
             ptst.setString(4,  birthday.getText());
             ptst.setString(5,  position.getText());
             ptst.setString(6,  phone.getText());
             ptst.setString(7,  SSS.getText());
             ptst.setString(8,  philhealth.getText());
             ptst.setString(9,  TIN.getText());
             ptst.setString(10, pagibig.getText());
             ptst.setString(11, status.getText());
             ptst.setDouble(12, Double.parseDouble(hourlyRate.getText()));
             ptst.setString(13, role.getText());
             ptst.setInt(14,    EmployeeId);
             ptst.executeUpdate();
             
             JOptionPane.showMessageDialog(null, "Employee Updated");
            
        } catch (Exception e) {}
    }
    
    public void deleteEmployee (int employeeId) {
        try (Connection con = DatabaseConnection.Connect()) {
             String query = "DELETE FROM users WHERE id = ?";
             PreparedStatement ptst = con.prepareStatement(query);
             ptst.setInt(1, employeeId);
             ptst.execute();
             
             JOptionPane.showMessageDialog(null, "Record Deleted");
             
        } catch (Exception e) {}
    }
    
    // for erorr handling
    public boolean hasLetters (String input) {
        for (char c: input.toCharArray()) {
            if (Character.isLetter(c)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean hasBlankFields (JTextField field1, JTextField field2, JTextField field3, JTextField field4, JTextField field5,
                                   JTextField field6, JTextField field7, JTextField field8, JTextField field9, JTextField field10,
                                   JTextField field11, JTextField field12, JTextField field13) 
    {
        return field1.getText().isBlank() || field2.getText().isBlank() || field3.getText().isBlank() || field4.getText().isBlank() ||
               field5.getText().isBlank() || field6.getText().isBlank() || field7.getText().isBlank() || field8.getText().isBlank() ||
               field9.getText().isBlank() || field10.getText().isBlank() || field11.getText().isBlank() || field12.getText().isBlank() ||
               field13.getText().isBlank();
    }
}

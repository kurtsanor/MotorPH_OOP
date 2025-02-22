
package motorphpayroll;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

// Tracks employee attendance records and work hours
public class AttendanceModule implements RecordOperations{
    
    private int employeeId;
    protected String selectedMonth;
    protected String selectedYear;
    
    public AttendanceModule (int employeeId) {
        this.employeeId = employeeId;
    }
    
    // loads the attendance records of the chosen employee in a specific period
    @Override
    public List <String []> getAllRecords() {
        List <String []> attendanceRecord = new ArrayList<>();
        try (Connection con = DatabaseConnection.Connect()) {
             String query = "SELECT * FROM attendance WHERE id = ?";
             PreparedStatement ptst = con.prepareStatement(query);
             ptst.setInt(1, employeeId);
             ResultSet rs = ptst.executeQuery();
                      
             while (rs.next()) {                
                 // split the date to identify the month and year
                 String [] dateParts = rs.getString("date").split("/");
                 
                 // dateParts[0] is the month, dateParts[2] is the year
                 if (dateParts[0].equals(getSelectedMonth(selectedMonth)) && dateParts[2].equals(selectedYear)) {
                     attendanceRecord.add(new String [] {
                     rs.getString("date"),
                     rs.getString("time_in"),
                     rs.getString("time_out"),
                     String.valueOf(calculateTotalHours(rs.getString("time_in"), rs.getString("time_out")))});
                 }
             }                               
        } catch (Exception e) {e.printStackTrace();}
        
        return attendanceRecord;
    }
    
    @Override
    public List <String []> search (String searchInput) {
        List <String []> searchResults = new ArrayList<>();
        
        try (Connection con = DatabaseConnection.Connect()) {
            String query = "SELECT * FROM users";
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
                    
            // if an employee name or id matches the search text, it adds it to the arraylist
            while (rs.next()) {
                String fullName = rs.getString("First_Name").toLowerCase() + " " + rs.getString("Last_Name").toLowerCase();
                if (rs.getString("id").contains(searchInput) || fullName.contains(searchInput.toLowerCase())) 
                {
                    searchResults.add(new String[]{rs.getString("id"),
                    rs.getString("Last_Name"),
                    rs.getString("First_Name")
                });
                }
            }
                                           
        } catch (Exception e) {e.printStackTrace();}
        
        return searchResults;
    }
    
    public String getSelectedMonth (String month) {
        switch (month) {
            case "January"  : return "01";
            case "February" : return "02";
            case "March"    : return "03";
            case "April"    : return "04";
            case "May"      : return "05";
            case "June"     : return "06";
            case "July"     : return "07";
            case "August"   : return "08";
            case "September": return "09";
            case "October"  : return "10";
            case "November" : return "11";
            case "December" : return "12";
            default         : return null;
        } 
    }
    
    public void setSelectedMonth (String selectedMonth) {
        this.selectedMonth = selectedMonth;
    }
    
    public void setSelectedYear (String selectedYear) {
        this.selectedYear = selectedYear;
    }
    
    public String getSelectedYear() {
        return selectedYear;
    }
    
    public int getEmployeeId () {
        return employeeId;
    }
    
    public void setEmployeeId (int employeeId) {
        this.employeeId = employeeId;
    }
    
    
    // helper method to get the total work hours in a day
    public double calculateTotalHours (String time_in, String time_out) {
        if (time_out == null) return 0;
            
        String [] timeIn = time_in.split(":");             
        String [] timeOut = time_out.split(":");
        
        double timeInDecimal = Integer.parseInt(timeIn[0]) + (Integer.parseInt(timeIn[1]) / 60.0);
        double timeOutDecimal = Integer.parseInt(timeOut[0]) + (Integer.parseInt(timeOut[1]) / 60.0);
                      
        return Math.round((timeOutDecimal - timeInDecimal) * 100.0) / 100.0;
    }
    
    // gets the total work hours on the chosen month and year
    public double getMonthlyHoursWorked () {
        double totalHours = 0;
        try (Connection con = DatabaseConnection.Connect()) {            
             String query = "SELECT * FROM attendance WHERE id = ?";
             PreparedStatement ptst = con.prepareStatement(query);
             ptst.setInt(1, employeeId);
             ResultSet rs = ptst.executeQuery();
                                 
             while (rs.next()) {
                 String [] dateParts = rs.getString("date").split("/");
                 if (dateParts[0].equals(getSelectedMonth(selectedMonth)) && dateParts[2].equals(selectedYear)) {
                     totalHours += calculateTotalHours(rs.getString("time_in"), rs.getString("time_out"));
                }
             }      
             
        } catch (Exception e) {e.printStackTrace();}
        
        return Math.round(totalHours * 100.0) / 100.0;
    }
    
    public boolean timeIn (String [] details) {        
        try (Connection con = DatabaseConnection.Connect()) {
             String checkQuery = "SELECT * FROM attendance WHERE id = ? AND date = ? AND time_out IS NULL";
             PreparedStatement checkPst = con.prepareStatement(checkQuery);
             checkPst.setInt(1, Integer.parseInt(details[0])); // employee id
             checkPst.setString(2, details[1]);
             ResultSet checkResult = checkPst.executeQuery();
             
             if (checkResult.next()) {
                 System.out.println("already timed in");
                 return false; // return false if employee already timed in and has not timed out yet
             }
             
             // otherwise allow employee to time in
             String query = "INSERT INTO attendance (id, date, time_in) "
                          + "VALUES (?,?,?)";
             PreparedStatement ptst = con.prepareStatement(query);
             ptst.setInt(1, Integer.parseInt(details[0])); // employee id
             ptst.setString(2, details[1]); // current date
             ptst.setString(3, details[2]); // current time
             ptst.executeUpdate();
             
             System.out.println("success");
             return true;
             
             
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }            
    }
    
    public boolean timeOut (String [] details) {        
        try (Connection con = DatabaseConnection.Connect()) {
            
             // check if the employee has already timed in
             String checkQuery = "SELECT * FROM attendance WHERE id = ? AND date = ? AND time_out IS NULL ORDER BY `Attendance #` DESC LIMIT 1";
             PreparedStatement checkPst = con.prepareStatement(checkQuery);
             checkPst.setInt(1, Integer.parseInt(details[2])); // employee id
             checkPst.setString(2, details[1]); // current date
             ResultSet checkResult = checkPst.executeQuery();

             // if the result is empty, this means that the employee has not yet timed in, therefore time out is not allowed
             if (!checkResult.next()) {
                 return false;
             }                                    
             
             // otherwise allow time out  
             int attendanceID = checkResult.getInt("Attendance #");
             String query = "UPDATE attendance SET time_out = ? WHERE `Attendance #` = ?";
             PreparedStatement ptst = con.prepareStatement(query);
             ptst.setString(1, details[0]); // current time
             ptst.setInt(2, attendanceID); // attendance id
             ptst.executeUpdate();
             
             System.out.println("success");
             return true;
             
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

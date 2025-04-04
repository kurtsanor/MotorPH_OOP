package oopClasses;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Tracks employee attendance records and work hours
public class AttendanceModule implements RecordOperations {
    
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
            String query = "SELECT * FROM attendance WHERE id = ? AND YEAR(new_date) = ? AND MONTH(new_date) = ?";
            PreparedStatement ptst = con.prepareStatement(query);
            ptst.setInt(1, employeeId);
            int month = getSelectedMonth(selectedMonth);
            int year = Integer.parseInt(selectedYear);
            ptst.setInt(2, year);
            ptst.setInt(3, month);
            ResultSet rs = ptst.executeQuery();
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            
            while (rs.next()) {
                String date = rs.getDate("new_date").toLocalDate().format(formatter);
                LocalTime timeIn = rs.getTime("new_time_in").toLocalTime();
                LocalTime timeOut = (rs.getTime("new_time_out") != null) ? rs.getTime("new_time_out").toLocalTime() : null;
                String totalHours = String.valueOf(calculateTotalHours(timeIn, timeOut));
                
                attendanceRecord.add(new String [] { date, String.valueOf(timeIn), String.valueOf(timeOut), totalHours});
                             
            }                               
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return attendanceRecord;
    }
    
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
    
    public int getSelectedMonth (String month) {
        switch (month) {
            case "January"  : return 1;
            case "February" : return 2;
            case "March"    : return 3;
            case "April"    : return 4;
            case "May"      : return 5;
            case "June"     : return 6;
            case "July"     : return 7;
            case "August"   : return 8;
            case "September": return 9;
            case "October"  : return 10;
            case "November" : return 11;
            case "December" : return 12;
        }
        return -1;
    }
    
    public void setSelectedMonth (String selectedMonth) {
        this.selectedMonth = selectedMonth;
    }
    
    public String getSelectedMonth () {
        return selectedMonth;
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
    public double calculateTotalHours (LocalTime timeIn, LocalTime timeOut) {
        if (timeOut == null || timeIn == null) return 0.0;
        
        long totalMinutes = ChronoUnit.MINUTES.between(timeIn, timeOut);
        double totalHours = totalMinutes / 60.0;
        
        // round off to 2 decimal places
        return Math.round(totalHours * 100.0) / 100.0;                            
    }
    
    // gets the total work hours of an employee on the chosen month and year
    public double getMonthlyHoursWorked () {
        double totalHours = 0;
        
        try (Connection con = DatabaseConnection.Connect()) {            
            String query = "SELECT * FROM attendance WHERE id = ? AND YEAR(new_date) = ? AND MONTH(new_date) = ?";
            PreparedStatement ptst = con.prepareStatement(query);
            int month = getSelectedMonth(selectedMonth);
            int year = Integer.parseInt(selectedYear);
            ptst.setInt(1, employeeId);
            ptst.setInt(2, year);
            ptst.setInt(3, month);
            ResultSet rs = ptst.executeQuery();
                                          
            while (rs.next()) {
                LocalTime timeIn = rs.getTime("new_time_in").toLocalTime();
                LocalTime timeOut = rs.getTime("new_time_out").toLocalTime();
                
                totalHours += calculateTotalHours(timeIn, timeOut);               
            }      
             
        } catch (Exception e) {
            e.printStackTrace();
        }
        // round off to 2 decimal places
        return Math.round(totalHours * 100.0) / 100.0;
    }
    
    public boolean timeIn (int employeeID) {  
        LocalTime currentTime = LocalTime.now();
        LocalDate currentDate = LocalDate.now();
        
        try (Connection con = DatabaseConnection.Connect()) {
            String checkQuery = "SELECT * FROM attendance WHERE id = ? AND new_date = ? AND new_time_out IS NULL";
            PreparedStatement checkPst = con.prepareStatement(checkQuery);
            checkPst.setInt(1, employeeID); // employee id
            checkPst.setDate(2, Date.valueOf(currentDate));
            ResultSet checkResult = checkPst.executeQuery();
             
            if (checkResult.next()) {
                return false; // return false if employee already timed in and has not timed out yet
            }
             
            // otherwise allow employee to time in
            String query = "INSERT INTO attendance (id, new_date, new_time_in) "
                         + "VALUES (?,?,?)";
            PreparedStatement ptst = con.prepareStatement(query);
            
            
            
            ptst.setInt(1, employeeID); // employee id
            ptst.setDate(2, Date.valueOf(currentDate)); // current date           
            ptst.setTime(3, Time.valueOf(currentTime)); // current time
            ptst.executeUpdate();
             
            return true;
                         
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }            
    }
    
    public boolean timeOut (int employeeID) {
        LocalTime currentTime = LocalTime.now();
        LocalDate currentDate = LocalDate.now();     
        
        try (Connection con = DatabaseConnection.Connect()) {
            
             // check if the employee has already timed in
             String checkQuery = "SELECT * FROM attendance WHERE id = ? AND new_date = ? AND new_time_out IS NULL ORDER BY `Attendance #` DESC LIMIT 1";
             PreparedStatement checkPst = con.prepareStatement(checkQuery);
             checkPst.setInt(1, employeeID); // employee id
             checkPst.setDate(2, Date.valueOf(currentDate)); // current date
             ResultSet checkResult = checkPst.executeQuery();
             
             // if the result is empty, this means that the employee has not yet timed in, therefore time out is not allowed
             if (!checkResult.next()) {
                 return false;
             }                                    
             
             // otherwise allow time out  
             int attendanceID = checkResult.getInt("Attendance #");
             String query = "UPDATE attendance SET new_time_out = ? WHERE `Attendance #` = ?";
             PreparedStatement ptst = con.prepareStatement(query);
             ptst.setTime(1, Time.valueOf(currentTime)); // current time
             ptst.setInt(2, attendanceID); // attendance id
             ptst.executeUpdate();
                        
             return true;
             
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // calculates all employees work hours each month and stores it in a hashmap for faster look up
    public Map <String, Double> getAllEmployeesMonthlyHours () {
        Map <String, Double> workHoursMap = new HashMap<>();
        
        try (Connection con = DatabaseConnection.Connect()) {
            String query = "SELECT * FROM attendance";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
                        
            String [] key = new String [3]; // keys will be the id, month, and year
            
            while (rs.next()) {
                LocalDate date = rs.getDate("new_date").toLocalDate();
                
                setSelectedMonth(String.valueOf(date.getMonth().getValue())); // set month to the current one in the resultset
                setSelectedYear(String.valueOf(date.getYear())); // set year to the current one in the resultset
                
                key[0] = rs.getString("id");
                key[1] = getSelectedMonth();
                key[2] = getSelectedYear();
                
                LocalTime timeIn = rs.getTime("new_time_in").toLocalTime();
                LocalTime timeOut = rs.getTime("new_time_out").toLocalTime();
                               
                double hoursWorked = calculateTotalHours(timeIn, timeOut);
                
                // add the keys and the total hours as values to the hashmap. the hours worked will keep adding up depending on the month
                workHoursMap.put(Arrays.toString(key), workHoursMap.getOrDefault(Arrays.toString(key), 0.0) + hoursWorked);                                             
            }   
            
        } catch (Exception e) {}
        
        return workHoursMap;
    }
    
    // gets the latest time in/time out of an employee
    public String [] getLatestRecord () {
        String [] record = new String [2]; // for time in and time out
        try (Connection con = DatabaseConnection.Connect()) {
            String query = "SELECT * FROM attendance WHERE id = ? ORDER BY `Attendance #` DESC LIMIT 1";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, employeeId);
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                record[0] = rs.getString("new_time_in");
                record[1] = rs.getString("new_time_out");
            }                      
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return record;
    }
    
    // method to check if an employee has an attendance record/s on the said date
    public boolean hasRecords (int employeeID, String month, String year) {
        try (Connection con = DatabaseConnection.Connect()) {
            String query = "SELECT * FROM attendance WHERE id = ? AND MONTH(new_date) = ? AND YEAR(new_date) = ?";
            PreparedStatement pst = con.prepareStatement(query);
            int convertedMonth = getSelectedMonth(month);
            pst.setInt(1, employeeID);
            pst.setInt(2, convertedMonth);
            pst.setInt(3, Integer.parseInt(year));
            ResultSet rs = pst.executeQuery();
            
            return rs.next();
                                                
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}

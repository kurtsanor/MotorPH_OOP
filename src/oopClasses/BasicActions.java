/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopClasses;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author keith
 */
public interface BasicActions {
    String [] viewPersonalSalary(String month, String year);
    List<String[]> viewPersonalAttendanceRecords (String month, String year);
    boolean requestForLeave (int employeeID, LocalDate startDate, LocalDate endDate, String reason, String firstName, String lastName, String leaveType);
    List <String[]> viewPersonalLeaveRecords (int employeeID);
}

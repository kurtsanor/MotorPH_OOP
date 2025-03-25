
package oopClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
     
    private static String URL = "jdbc:MYSQL://localhost:3306/employee_database";
    private static String USER = "root";
    private static String PASSWORD = "";
    
    public static Connection Connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

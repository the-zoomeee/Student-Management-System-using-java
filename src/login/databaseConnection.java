package login;


import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bharat
 */
public class databaseConnection {
    
    final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; // Updated driver class name
    final static String DB_URL = "jdbc:mysql://localhost:3306/student";

    final static String USER = "root";
    final static String PASS = "";

    public static Connection connection() {
        Connection conn = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Database connection successful.");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Database connection error: " + e.getMessage());
            System.err.println("Database connection error: " + e.getMessage());
        }
        return conn;
    }
}

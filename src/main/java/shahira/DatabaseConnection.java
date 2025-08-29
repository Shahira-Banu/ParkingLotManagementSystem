package shahira;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    // Update these values according to your MySQL setup
    private static final String URL = "jdbc:mysql://localhost:3306/parkinglotDB"; // your DB name
    private static final String USER = "root";   // your MySQL username
    private static final String PASSWORD = "sha_123@ira"; // your MySQL password

    public static Connection getConnection() {
        Connection con = null;
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Get connection
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Database connected successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("❌ Database connection failed!");
        }
        return con;
    }
}

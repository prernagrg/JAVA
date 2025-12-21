import java.lang.*;
import java.sql.*;

public class JdbcConnectionMysql {
    public static void main(String[] args) throws Exception {

        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Create connection
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student+", "root", "");

        // Create statement
        Statement stmt = con.createStatement();

        // Correct SQL query
        String student = "CREATE TABLE student (" +
                "stud_id INT, " +
                "stud_name VARCHAR(20), " +
                "stud_address VARCHAR(30)," + "roll_no INT)";

        // Execute query
        stmt.execute(student);

        // Close resources
        stmt.close();
        con.close();

        System.out.println("Table created successfully");
    }
}

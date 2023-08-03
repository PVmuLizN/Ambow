package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCUtils {
    // Load the MySQL driver
    

    // Connect to the database
    String connectionUrl = "jdbc:mysql://localhost:3306/ambow505";
    Connection conn = DriverManager.getConnection(connectionUrl, "username", "password");

    // Execute a query
    Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM person");

    // Process the result set
    while(rs.next())
    {
        long id = rs.getLong("ID");
        String name = rs.getString("FIRST_NAME");
        String lastName = rs.getString("LAST_NAME");
        // do something with the extracted data...
    }

    // Close the resources
    rs.close();stmt.close();conn.close();
}

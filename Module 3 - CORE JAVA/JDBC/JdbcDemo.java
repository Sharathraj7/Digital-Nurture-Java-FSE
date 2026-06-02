import java.sql.*;

public class JdbcDemo {
//     31. Basic JDBC Connection 
// • Objective: Connect Java with a relational database. 
// • Task: Connect to a local MySQL/SQLite database and retrieve data. 
// • Instructions: 
// o Set up a database with a students table. 
// o Write code to load the JDBC driver, create a connection, execute a SELECT query, and 
// print results.
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "root";

        try {
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(
                    url, user, password);

            // Execute Query
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(
                    "SELECT * FROM students");

            // Print Results
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getInt("age"));
            }

            // Close Resources
            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
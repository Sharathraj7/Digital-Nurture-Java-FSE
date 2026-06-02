import java.sql.*;

public class StudentDAO {
//     32. Insert and Update Operations in JDBC 
// • Objective: Perform insert/update SQL queries from Java. 
// • Task: Add and modify student data using JDBC. 
// • Instructions: 
// o Create a StudentDAO class. 
// o Implement methods to insert new records and update student details. 
// o Use PreparedStatement for parameterized queries.

    private String url = "jdbc:mysql://localhost:3306/college";
    private String user = "root";
    private String password = "root";

    // Insert Student
    public void insertStudent(int id, String name, int age) {
        String query = "INSERT INTO students VALUES (?, ?, ?)";

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);

            int rows = ps.executeUpdate();

            System.out.println(rows + " record inserted");

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Update Student
    public void updateStudent(int id, String name) {
        String query = "UPDATE students SET name=? WHERE id=?";

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            System.out.println(rows + " record updated");

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
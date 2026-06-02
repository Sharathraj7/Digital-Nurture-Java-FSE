import java.sql.*;

public class TransactionDemo {

    static String url = "jdbc:mysql://localhost:3306/college";
    static String user = "root";
    static String password = "root";

    public static void transferMarks(int fromId, int toId, int marks) {

        try {
            Connection con =
                    DriverManager.getConnection(url, user, password);

            // Start Transaction
            con.setAutoCommit(false);

            String deduct =
                    "UPDATE students SET marks = marks - ? WHERE id = ?";

            String add =
                    "UPDATE students SET marks = marks + ? WHERE id = ?";

            PreparedStatement ps1 =
                    con.prepareStatement(deduct);

            PreparedStatement ps2 =
                    con.prepareStatement(add);

            // Deduct Marks
            ps1.setInt(1, marks);
            ps1.setInt(2, fromId);
            int r1 = ps1.executeUpdate();

            // Add Marks
            ps2.setInt(1, marks);
            ps2.setInt(2, toId);
            int r2 = ps2.executeUpdate();

            if (r1 > 0 && r2 > 0) {
                con.commit();
                System.out.println("Transaction Successful");
            } else {
                con.rollback();
                System.out.println("Transaction Failed");
            }

            ps1.close();
            ps2.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        transferMarks(1, 2, 10);
    }
}
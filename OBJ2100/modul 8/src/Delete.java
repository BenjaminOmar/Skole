import java.sql.*;

public class Delete {
    public static void main(String[] args) throws SQLException {
        String dbUrl = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String pass = "";

        Connection myCon = DriverManager.getConnection(dbUrl, user, pass);
        Statement myStmt = myCon.createStatement();

        int rowsAffected = myStmt.executeUpdate("delete from employees " +
        "where last_name='Doe' and first_name='John'");

        System.out.println(rowsAffected);
    }
}

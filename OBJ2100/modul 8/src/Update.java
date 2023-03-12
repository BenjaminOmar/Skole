import java.sql.*;

public class Update {
    public static void main(String[] args) throws SQLException {
        String dbConnection = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String pass = "";

        Connection myCon = DriverManager.getConnection(dbConnection, user, pass);
        Statement myStmt = myCon.createStatement();
        
        int rowsAffected = myStmt.executeUpdate("update employees " +
        "set email='john.doe@luv2code.com' " +
        "where last_name='Doe' and first_name='John'");

        System.out.println(rowsAffected);
    }
}

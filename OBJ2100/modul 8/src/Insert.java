import java.sql.*;

public class Insert {
    public static void main(String[] args) throws SQLException {
        String dbConnection = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String pass = "";

        Connection myCon = DriverManager.getConnection(dbConnection, user, pass);
        Statement myStm = myCon.createStatement();

        int rowsAffected = myStm.executeUpdate("insert into employees " +
        "(last_name, first_name, email, department, salary) " + 
        "values " + 
        "('Wright', 'Eric', 'eric.wright@foo.com', 'HR', 33000.00)");
        
        System.out.println(rowsAffected);
    }
}

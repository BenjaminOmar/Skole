import java.sql.*;

public class Select {
    public static void main(String[] args) throws SQLException {
        
        String dbUrl = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String pass = "";

        Connection myConn = DriverManager.getConnection(dbUrl, user, pass);
        Statement myStmt = myConn.createStatement();

        ResultSet myRs = myStmt.executeQuery("select * from employees");


        while (myRs.next()) {
            System.out.println(myRs.getString("first_name") + " " + myRs.getString("last_name"));
        }
    }
}

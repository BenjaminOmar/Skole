import java.sql.*;

public class PrepareStatement {
    public static void main(String[] args) throws SQLException {
        String dbUrl = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String pass = "";

        Connection myCon = DriverManager.getConnection(dbUrl, user, pass);
        PreparedStatement myStmt = myCon.prepareStatement("select * from employees where salary > ? and department=?");

        myStmt.setDouble(1, 80000);
        myStmt.setString(2, "Legal");

        ResultSet myRs = myStmt.executeQuery();

        while (myRs.next()) {
            System.out.println(myRs.getString("first_name"));
        }

        
    }
}

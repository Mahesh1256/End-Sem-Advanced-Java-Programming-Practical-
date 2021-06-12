//Name : Vinod Singh Airy
//Uni RollNo.: 1018635
//Sem: 6
//Sec: C

import java.sql.*;
class MyJDBC {
    public static void main(String[] args) throws SQLException
    {

        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        try {
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root" , "mysql");
            myStmt = myConn.createStatement();
            myRs = myStmt.executeQuery("select * from books");
            while (myRs.next()) {
                System.out.println(myRs.getString("Accession no.") + ", " + myRs.getString("title") + ", " + myRs.getString("Authors") + ", " + myRs.getString("Edition")+ ", " + myRs.getString("publisher"));
            }
        }

        catch (Exception exc) {
            exc.printStackTrace();
        }

        finally {
            myRs.close();
            myStmt.close();
            myConn.close();
        }
    }
}


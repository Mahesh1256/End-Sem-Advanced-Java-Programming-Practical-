package com.java.jdbc;
import java.sql.*;
public class Question1 {
	public static void main(String[] args) throws SQLException {
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		String sql11 = "INSERT INTO jdbc_tbl VALUES (3, 'Java', 'Remo', '2015','Sainik')";
		String sql12 = "INSERT INTO jdbc_tbl VALUES (4, 'C++', 'Sumitra', '2012','Sainik')";
		Scanner s = new Scanner(System.in);
        		num = s.nextInt();
		String sql2 = "SELECT * FROM jdbc_tbl where accno=num";
		try {
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDatabase", "root" , "ritik@123");
			myStmt = myConn.createStatement();
		/*Insert into table*/
			myStmt.executeUpdate(sql11);
			myStmt.executeUpdate(sql12);
		/*Check Updated Table*/
			myRs = myStmt.executeQuery(sql2);
			System.out.println();
			System.out.println("accno" + "    " + "title" + "  " + "author"+ "   " + "edition" + "   "+ "publisher");	
			while (myRs.next()) {
				System.out.println(myRs.getString("accno") + "     " + myRs.getString("title") + "     " + myRs.getString("author") + "    " +
				myRs.getString("edition")+  "         "+ "       "+ myRs.getString("publisher"));
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

package com.priyanshi;
import java.sql.*;
public class SampleClass {
	 public static void main(String args[]) throws SQLException 
     {
	Connection myConn = null;
	Statement myStmt = null;
	ResultSet myRs = null;
	try
	  {

	           myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root" , "");
	           myStmt = myConn.createStatement();
                           myRs = myStmt.executeQuery("select * from Information");
                           while (myRs.next()) 
	              {
	                  System.out.println(myRs.getString("Acess_no") + ", " + myRs.getString("title") + ", " + myRs.getString("Author") + ", " + 
myRs.getString("edition") + ", " + myRs.getString("publisher"));

	              }
                    }
	catch (Exception exc) 
	{
	         exc.printStackTrace();
	}
	finally
	 {
	         myRs.close();
                         myStmt.close();
                         myConn.close();
                  }
      }
}

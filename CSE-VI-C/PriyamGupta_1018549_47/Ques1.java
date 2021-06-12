/*Ques1: Priyam Gupta
Rollno.1018549
Sec C */
package com.jdbc.project;
import java.sql.*;

public class Ques2 
{
   public static void main(String args[]) throws SQLException 
    {
		//Declare connection variabless
	Connection myConn = null;
	Statement myStmt = null;
	ResultSet myRs = null;
	try
	{
		//create database connection
 
	     myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarys", "root" , "priyam1207");
	     myStmt = myConn.createStatement();
         myRs = myStmt.executeQuery("select * from book");
            while (myRs.next()) 
	        {
	            System.out.println(myRs.getString("Acc_no") + ", " + myRs.getString("Title") + ", " + myRs.getString("Author") + ", " + myRs.getString("Publisher")+ ", " + 
				myRs.getString("Edition"));

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
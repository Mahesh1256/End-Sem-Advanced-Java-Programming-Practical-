package com.neeraj.servlet;
import java.sql.*;
import java.util.*;
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspWriter;

import org.apache.jasper.tagplugins.jstl.core.Out;

@WebServlet("/info")
public class info extends HttpServlet  {
	protected void doGet(HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		Connection myConn = null;
		Statement myStmt = null;
		int acc = Integer.parseInt(request.getParameter("accno"));
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String edition = request.getParameter("edition");
		String publish = request.getParameter("publish");
		try {
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root" , "Neeraj@123");
			myStmt = myConn.createStatement();
			myStmt.executeUpdate("insert into info (accno,title,authors,edition,publisher) values ("+acc+","+title+","+author+","+edition+","+publish+")");
			PrintWriter out = response.getWriter();
			out.println("Record Successfully Submitted!!");
		}	
		catch (Exception exc) {
			exc.printStackTrace();
        }
	}
}
package com.Practical;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Name:    Arvind Singh
 * Roll No: 1018451
 * Sem:     6
 */
@WebServlet("/store")
public class Store extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
//		AccessionNumber: <input name="AccessionNumber" type="text"></br>
//		Title      <input name="Title" type="text"></br>
//		Authors     <input name="Authors" type="text"></br>
//		Edition     <input name="Edition" type="text"></br>
//		Publishers  
		
		String accessionNumber = request.getParameter("AccesstionNumber");
		String Title = request.getParameter("Title");
		String Authors = request.getParameter("Authors");
		String Edition = request.getParameter("Edition");
		String Publishers = request.getParameter("Publishers");
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection conn;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/happy", "root", "mysql");
			PreparedStatement stmt = conn.prepareStatement("insert into book (accesstionNumber, title, authors, edition, publishers) values (?, ?, ?, ?, ?)");
			stmt.setString(1, accessionNumber);
	        stmt.setString(2,  Title);
	        stmt.setString(3, Authors);
	        stmt.setString(4,  Edition);
	        stmt.setString(5, Publishers);
	        stmt.executeUpdate();
	        conn.close();
	        response.sendRedirect("find.jsp");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
		
				
	}

}

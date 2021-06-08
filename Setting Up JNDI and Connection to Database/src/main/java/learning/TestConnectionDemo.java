package learning;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;



@WebServlet("/TestConnectionDemo")
public class TestConnectionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name="jdbc/project")
	private DataSource dataSource;
	
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Step 1: Initialize connection object
		//***************************************************************************************
		PrintWriter out = response.getWriter();
		Connection connect = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		// Add connection to the database
		try {
			connect = dataSource.getConnection();
			
			// Step 2: Create SQL statements string
			//***************************************************************************************
			String query = "Select * from users";
			stmt = connect.createStatement();
			
			// Step 3: Execute SQL query
			//***************************************************************************************
			rs = stmt.executeQuery(query);
			
			// Step 4: Process the result set
			//***************************************************************************************
			while(rs.next()) {
				out.print("<br>");
				out.print(rs.getString("email"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

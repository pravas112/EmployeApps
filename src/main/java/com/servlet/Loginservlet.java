package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.servlet.dao.EmployeeeDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Loginservlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   
		resp.setContentType("text/html");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		Connection dbConnection = EmployeeeDao.createDBConnection();
		
		Employee employee = new Employee();
		ResultSet rs = null;
		try {
			
			PreparedStatement pst = dbConnection.prepareStatement("select * from employeees where email=? and password=?");
		     pst.setString(1, email);
			 pst.setString(2, password);
			
			   rs = pst.executeQuery();
			 
			   boolean status = false;
			  while (rs.next()) {
				
				  status = true;
				employee.setId(rs.getString("id"));
				employee.setName(rs.getString("name"));
				employee.setEmail(rs.getString("email"));
			    employee.setPassword(rs.getString("password"));
			    employee.setGender(rs.getString("gender"));
			    employee.setCity(rs.getString("city"));
				
			    req.setAttribute("Name", rs.getString("name"));
			}
			  req.setAttribute("employee",employee);
			if(status) {
				
				req.getRequestDispatcher("displayemp.jsp").forward(req, resp);
			}
			else {
				req.setAttribute("msg", "Invalid email or password");
				//resp.getWriter().print("<h2 style= 'color:red; font-weight:800'>invalid email and password</h2>");
				req.getRequestDispatcher("Login.jsp").include(req, resp);
			}
			
			  
			  
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		
		
		
	}
}

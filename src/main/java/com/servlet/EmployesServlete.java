package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.servlet.dao.EmployeeeDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/save")
public class EmployesServlete extends HttpServlet{
  
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String city = req.getParameter("gender");
		String gender = req.getParameter("city");
		 
		
		Connection dbConnection = EmployeeeDao.createDBConnection();
		
		
		try {
		PreparedStatement pst = dbConnection.prepareStatement("insert into employeees values(?,?,?,?,?,?)");
		
		pst.setString(1, id);
		pst.setString(2, name);
		pst.setString(3, password);
		pst.setString(4, email);
		pst.setString(5, gender);
		pst.setString(6, city);
		
		
		
		int i =pst.executeUpdate();
		
		if(i>0) {
			
			resp.getWriter().print("<h2 style='color:green;font-weight:800'>Enter save sucess</h2>");
			req.getRequestDispatcher("employee.html").include(req, resp);
			
		}else {
			resp.getWriter().print("<h2 style='color:red;font-weight:800'>Enter save Notsucess</h2>");
			req.getRequestDispatcher("employee.html").include(req, resp);
			
			
		}
		
		
		
		} catch (Exception e) {
			resp.getWriter().print("<h2 style='color:red;font-weight:800'>'"+e.getMessage()+"'</h2>");
			req.getRequestDispatcher("employee.html").include(req, resp);
			// TODO: handle exception
		}
	}
	
}

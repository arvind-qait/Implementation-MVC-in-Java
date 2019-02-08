package controllar;

import model.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddUser extends HttpServlet 
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String empId = req.getParameter("empId");
		String empName = req.getParameter("empName");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		Model obj = new Model();
		obj.setEmpId(empId);
		obj.setEmpName(empName);
		obj.setEmail(email);
		obj.setPassword(password);
		
	}

}

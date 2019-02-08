package controllar;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import model.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyControllar extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		ResultSet rs;
		
//		out.println("<html>");
//		out.println("<body>");
//		out.println(email);
//		out.println("<br>");
//		out.println(password);
//		out.println("</body>");
//		out.println("</body>");
		
		Model m=new Model();
		m.setEmail(email);		
		m.setPassword(password);
		try
		{			
			rs=m.userLogin();
			if(rs.next())
			{
				res.sendRedirect("welcome.html");
			}
			else
			{
				
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
}

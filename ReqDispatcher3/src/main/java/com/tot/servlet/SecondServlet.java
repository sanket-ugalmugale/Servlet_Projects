package com.tot.servlet;
//import javax.servlet.annotation.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Enumeration;

//@WebServlet("/secondurl")
public class SecondServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		
		PrintWriter pw = res.getWriter();
		
		//Object age = req.getAttribute("Sanket");
		//pw.println("<h1 style = 'text-align : center;'>" +age+ "</h1>");
		
		Enumeration e = req.getAttributeNames();
		
		while(e.hasMoreElements())
		{
			String name = (String) e.nextElement();
			Object value = req.getAttribute(name);
			pw.println("<h1 style = 'text-align : center;'>" +name+ " - " +value+ "</h1> <br>");
		}
		
		pw.println("<h1 style = 'text-align : center;'> Second Servlet </h1>");
	}
}

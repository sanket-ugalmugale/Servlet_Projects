package com.tot.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
//import java.time.LocalDateTime;

public class CalculatorServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		
		PrintWriter pw = res.getWriter();
		 
		String val = req.getParameter("n1"); 
		
		if(!val.equalsIgnoreCase("text1") && !val.equalsIgnoreCase("text2"))
		{
			int a = Integer.parseInt(req.getParameter("v1"));
			int b = Integer.parseInt(req.getParameter("v2"));
			
			if(val.equalsIgnoreCase("add"))
			{
				pw.println("<h1 style='color:red; text-align:center;'>" + (a+b) + "</h1>");
				pw.println("<div style = 'text-align:center;'> <a href='calculator.html'> Home </a> </div>");
			}
			
			else if(val.equalsIgnoreCase("sub"))
			{
				pw.println("<h1 style='color:red; text-align:center;'>" + (a-b) + "</h1>");
				pw.println("<div style = 'text-align:center;'> <a href='calculator.html'> Home </a> </div>");
			}
			
			else if(val.equalsIgnoreCase("div"))
			{
				pw.println("<h1 style='color:red; text-align:center;'>" + a/b + "</h1>");
				pw.println("<div style = 'text-align:center;'> <a href='calculator.html'> Home </a> </div>");
			}
			
			else if(val.equalsIgnoreCase("mul"))
			{
				pw.println("<h1 style='color:red; text-align:center;'>" + a*b + "</h1>");
				pw.println("<div style = 'text-align:center;'> <a href='calculator.html'> Home </a> </div>");
			}
		}
		
		else if(val.equalsIgnoreCase("text1"))
		{	
			Date d = new Date();
			res.setHeader("Refresh","1");
			//pw.println("<h1 style='color:red; text-align:center;'> Date and Time : "+ LocalDateTime.now() +"</h1>");
			pw.println("<h1 style='color:red; text-align:center;'> Date and Time : "+d+"</h1>");
			pw.println("<div style = 'text-align:center;'> <a href='calculator.html'> Home </a> </div>");
		}
		
		else if(val.equalsIgnoreCase("text2"))
		{
			pw.println("<h1 style='color:red; text-align:center;'> System Properties </h1>");
			pw.println("<div style = 'text-align:center;'> <a href='calculator.html'> Home </a> </div> <hr>");
			pw.println(System.getProperties());
			
		}
	}
}

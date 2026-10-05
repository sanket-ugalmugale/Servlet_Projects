package com.tot.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;


public class DateApp extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/HTML");
		res.setHeader("Refresh", "1");
		
		Date d = new Date();
		
		PrintWriter pw = res.getWriter();
		
		pw.println("<h1 style='color:red; text-align:center'>Date and Time is: " +d+ "</h1>");
		
		pw.close();
	}
}


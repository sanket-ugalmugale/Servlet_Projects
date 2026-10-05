package com.tot.servlet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class GetPost extends HttpServlet
{	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<h1> GET called </h1>");
		pw.close();
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<h1> POST called </h1>");
		pw.close();
	}
}

package com.tot.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SecondServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		
		PrintWriter pw = res.getWriter();
		
		pw.println("<h1 style = 'text-align : center'> Servlet Component of Other Webapp but same server </h1>");
	}
}
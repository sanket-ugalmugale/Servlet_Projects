package com.tot.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class DemoFilter2 extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		
		PrintWriter pw = res.getWriter();
		
		pw.println("<h1 style = 'color : red ; text-align : center'> Hello </h1>");
	}
}

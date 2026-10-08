package com.tot.servlet;
import javax.servlet.annotation.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/secondurl")
public class SecondServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{	
		res.setContentType("text/html");
		
		PrintWriter pw = res.getWriter();
		
		pw.println("<h1>Second Servlet</h1>");
	}
}

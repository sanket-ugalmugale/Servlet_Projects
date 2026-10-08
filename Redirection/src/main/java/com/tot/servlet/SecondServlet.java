package com.tot.servlet;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

@WebServlet("/second")
public class SecondServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		
		PrintWriter pw = res.getWriter();
		
		pw.println("<h1 style = 'color : red ; text-align : center'> Second Servlet Executed </h1>");
		
		pw.close();
	}
}

package com.tot.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class FirstServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		ServletContext context = this.getServletContext();
		
		ServletContext fc = context.getContext("/ForeignDispatching2");
		
		RequestDispatcher rd = fc.getRequestDispatcher("/defurl");
		
		rd.forward(req, res);
	}
}

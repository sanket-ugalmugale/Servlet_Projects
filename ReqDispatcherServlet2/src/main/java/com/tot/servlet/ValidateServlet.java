package com.tot.servlet;

import javax.servlet.annotation.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/demo1")
public class ValidateServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String username = req.getParameter("uname");
		String password = req.getParameter("pwd");
		
		if(username.equals("sanket") && password.equals("sanket123"))
		{
			ServletContext context = this.getServletContext();
			
			RequestDispatcher rd = context.getRequestDispatcher("/inbox.jsp");
			
			rd.forward(req, res);
		}
		
		else
		{
			RequestDispatcher rd = req.getRequestDispatcher("error.jsp");
			
			rd.forward(req, res);
		}
	}
}

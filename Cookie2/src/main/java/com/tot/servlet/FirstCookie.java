package com.tot.servlet;

import javax.servlet.annotation.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/first")
public class FirstCookie extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{	
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String age = req.getParameter("age");
		String status = req.getParameter("status");
		
		Cookie c1 = new Cookie("Firstname",fname);
		Cookie c2 = new Cookie("Lastname",lname);
		Cookie c3 = new Cookie("Age",age);
		Cookie c4 = new Cookie("Maritalstatus",status);
		
		res.addCookie(c1);
		res.addCookie(c2);
		res.addCookie(c3);
		res.addCookie(c4);
		
		if("married".equals(status))
		{
			RequestDispatcher rd = req.getRequestDispatcher("two.html");
			rd.include(req, res);
		}
		else
		{
			RequestDispatcher rd = req.getRequestDispatcher("three.html");
			rd.include(req, res);
		}
	}
}

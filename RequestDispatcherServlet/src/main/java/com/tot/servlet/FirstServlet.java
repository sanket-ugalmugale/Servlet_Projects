package com.tot.servlet;
import javax.servlet.annotation.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/firsturl")
public class FirstServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{	
		res.setContentType("text/html");
	
		RequestDispatcher rd = req.getRequestDispatcher("/secondurl");
		
		rd.forward(req, res);
	}
}

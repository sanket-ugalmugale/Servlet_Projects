package com.tot.servlet;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

@WebServlet("/first")
public class FirstServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setHeader("content-type", "text/html");
		
		//res.setStatus(302);
		
		//res.setHeader("Location", "/Redirection/second");
		//res.setHeader("Location", "/BinaryVideo/videourl");
		
		res.sendRedirect("/Redirection/second");   /*res.setStatus(302);  anni  res.setHeader("Location", "/Redirection/second"); 
		 											ya 2 method use na karta apan direct hi method use kru shkto*/
	}
}

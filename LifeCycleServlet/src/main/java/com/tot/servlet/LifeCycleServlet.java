package com.tot.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class LifeCycleServlet extends HttpServlet
{
	static 
	{
		System.out.println("LifeCycleServlet static block");
	}
	
	public LifeCycleServlet()
	{
		System.out.println("LifeCycleServlet zero parameter constructor");
	}
	
	public void init(ServletConfig cfg) throws ServletException
	{
		System.out.println("LifeCycleServlet init method");
	}
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		System.out.println("LifeCycleServlet service method");
		
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		Date d = new Date();
		
		pw.println("<h1>"+d+"</h1>");
		
		pw.close();
	}
	
	public void destroy()
	{
		System.out.println("LifeCycleServlet destroy method");
	}
}

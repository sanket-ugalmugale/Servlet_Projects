package com.tot.servlet;

import javax.servlet.*;
import java.io.*;

public class DemoFilter implements Filter
{
	public void init(FilterConfig fcg) throws ServletException
	{
		System.out.println("Filter Initialized");
	}
	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain fc) throws ServletException, IOException
	{
		System.out.println("Pre Processing");
		
		fc.doFilter(req, res);
		
		System.out.println("Post Processing");
	}
	
	public void destroy()
	{
		System.out.println("Filter Destroy");
	}
}


//http://localhost:8080/ServletFilter/demo
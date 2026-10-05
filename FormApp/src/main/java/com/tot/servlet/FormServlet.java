package com.tot.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class FormServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		int age=0;
		String name = req.getParameter("pname");
		String sage = req.getParameter("page");
		String smobile = req.getParameter("mobile");
		String vflag = req.getParameter("validateflag");
		
		if(vflag.equalsIgnoreCase("false"))
		{
			List <String> errorlist = new ArrayList<>();
			
			if (name==null || name.length()==0 || name.equalsIgnoreCase(""))
			{
				errorlist.add("name may not be empty");
			}
			
			if(sage==null || sage.length()==0 || sage.equalsIgnoreCase("")) 
			{
				errorlist.add("age may not be empty");
			}
			
			else
			{
				try 
				{ 
					age = Integer.parseInt(sage);
				}
				catch(NumberFormatException nfe)
				{
					errorlist.add("age must be numeric");
				}
				
				
				if(age<=0 || age>100)
				{
					errorlist.add("age should greater than 0 and less than 100");
				}
	
			}
			
			if(smobile==null || smobile.length()==0 || smobile.equalsIgnoreCase(""))
			{
				errorlist.add("Mobile number may not be empty.");
			}
			
			else
			{
				if(smobile.length() != 10)
				{
				    errorlist.add("Mobile number should contain exactly 10 digits.");
				}
				
				try
				{
				    Long.parseLong(smobile);
				}
				catch(NumberFormatException e)
				{
				    errorlist.add("Mobile number must be numeric.");
				}
			}
			
			if(errorlist.size()>0)
			{
				pw.println("<ul style='color:red ; text-align:center;'>");
				
				for(String error:errorlist)
				{
					pw.println("<li>" +error+ "</li>");
				}
				pw.println("</ul>");
				pw.println("<div style='text-align:center;'><a href= 'form.html'> home </a> </div>");
				return;
			}	
		
		}
		
			if(age<18)
			{
				pw.println("<h1 style='color:green ; text-align:center';> Mr/Mrs."+ name + " is not eligible for marriage </h1>");
			}
			
			else
			{
				pw.println("<h1 style='color:green ; text-align:center';> Mr/Mrs." +name+ " is eligible for marriage </h1>");
			}
			
			pw.println("<div style='text-align:center;'><a href= 'form.html'> home </a> </div>");
		
		pw.close();
	}
}

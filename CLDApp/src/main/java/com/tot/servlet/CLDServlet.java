package com.tot.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
//import java.text.*;

public class CLDServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		
		PrintWriter pw = res.getWriter();
		
		String a = req.getParameter("n1");
		
		List <String> list = new ArrayList<>();
		
		if(a.equalsIgnoreCase("v1")) 
		{
			list.add("India");
			list.add("Pakistan");
			list.add("Australia");
			list.add("New zealand");
			list.add("Sounth Africa");
			
			pw.println("<h1 style='color:green; text-align:center'> List of Countries </h1>");
			
			for(String country : list)
			{
				pw.println("<h1 style='text-align:center;'>" + country + "<br> </h2>");
			}
			pw.println("<div style='text-align:center;'> <a href='cld.html'> HOME </a> </div>");
		}
		
		else if(a.equalsIgnoreCase("v2")) 
		{
			list.add("Marathi");
			list.add("Hindi");
			list.add("English");
			list.add("Japanese");
			list.add("German");
			
			pw.println("<h1 style='color:green; text-align:center'> List of Languages </h1>");
			
			for(String language : list)
			{
				pw.println("<h1 style='text-align:center;'>" + language + "<br> </h2>");
			}
			pw.println("<div style='text-align:center;'> <a href='cld.html'> HOME </a> </div>");
		}
		
		else if(a.equalsIgnoreCase("v3"))
		{
		    Locale[] locales = Locale.getAvailableLocales();

		    Date d = new Date();

		    pw.println("<h1 style='color:green; text-align:center'>Available Locales</h1>");
		    pw.println("<h3>Current Date and Time : " + d + "</h3><hr>");
		    pw.println("<div style='text-align:center;'> <a href='cld.html'> HOME </a> </div>");

		    for(Locale loc : locales)
		    {
		        pw.println(loc.getDisplayName() + "<br>");
		    }
		}
		
		/*else if(a.equalsIgnoreCase("v3"))
		{
		    Locale[] locales = Locale.getAvailableLocales();

		    Date d = new Date();

		    for(Locale loc : locales)
		    {
		        String dt = DateFormat.getDateTimeInstance(
		                DateFormat.FULL,
		                DateFormat.FULL,
		                loc).format(d);

		        pw.println("<b>" + loc.getDisplayName() + "</b> : " + dt + "<br><br>");
		    }
		}*/
		
		
	}
}
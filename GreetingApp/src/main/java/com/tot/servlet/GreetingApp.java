package com.tot.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.time.LocalDateTime;

public class GreetingApp extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/HTML");
		res.setHeader("Refresh", "1");
		
		PrintWriter pw = res.getWriter();
		
		LocalDateTime lct =LocalDateTime.now();
		pw.println("<h1 style= 'color: red; text-align:center'>" +lct+ "</h1>");
		
		int time = lct.getHour();
		
		if(time < 12)
		{
			pw.println("<h1 style= 'color: green; text-align:center'> Good Morning... </h1>");
		}
		
		else if(time < 16)
		{
			pw.println("<h1 style='color:orange; text-align:center'> Good Afternoon... </h1>");
		}
		
		else if(time < 20)
		{
			pw.println("<h1 style='color:skyblue; text-align:center'> Good Evening... </h1>");
		}
		
		else
		{
			pw.println("<h1 style='text-align:center'> Good Night... </h1>");
		}
		
		pw.close();
	}
}

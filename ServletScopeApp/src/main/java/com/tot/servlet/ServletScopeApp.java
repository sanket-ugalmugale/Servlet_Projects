package com.tot.servlet;
import javax.servlet.annotation.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/scope")
public class ServletScopeApp extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		
		PrintWriter pw = res.getWriter();
		
		/*ServletContext context = this.getServletContext();
		 
		Integer count = (Integer)context.getAttribute("hitcount");
		
		if(count == null)
		{
			count = 1;
		}
		else
		{
			count ++;
		}
		
		context.setAttribute("hitcount",count);
		
		pw.println("<h1>Number of Request to Application are " +count+ "</h1>");*/
		
		
		
		HttpSession session = req.getSession();
		
		Integer count = (Integer)session.getAttribute("usercount");
		
		if(session.isNew())
		{
			if(count == null)
			{
				count = 1;
			}
			else
			{
				count ++;
			}
		}
		
		session.setAttribute("usercount",count);
		
		
		pw.println("<h1>Number of Requests by this User are " +count+ "</h1>");
	}
}

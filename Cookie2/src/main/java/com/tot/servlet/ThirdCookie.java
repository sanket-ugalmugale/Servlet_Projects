package com.tot.servlet;

import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

@WebServlet("/third")
public class ThirdCookie extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		String when = req.getParameter("when");
		String why = req.getParameter("why");
		
		Cookie c7 = new Cookie("WhenToMarry", when);
		Cookie c8 = new Cookie("WhyToMarry", why);
		
		res.addCookie(c7);
		res.addCookie(c8);
		
		Cookie ck[] = req.getCookies();
		
		if(ck != null)
		{
			for(Cookie cookie : ck)
			{
				pw.println(cookie.getName()+ " : " + cookie.getValue() +"<br>");
			}
		}
		
		pw.println(c7.getName()+ " : " + c7.getValue() +"<br>");
		pw.println(c8.getName()+ " : " + c8.getValue() +"<br>");
				
	}
}

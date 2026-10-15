package com.tot.servlet;

import javax.servlet.annotation.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/second")
public class SecondCookie extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		String spouse = req.getParameter("sname");
		String child = req.getParameter("child");
		
		Cookie c5 = new Cookie("Spousename", spouse);
		Cookie c6 = new Cookie("Childrens", child);
		
		res.addCookie(c5);
		res.addCookie(c6);
		
		Cookie ck[] = req.getCookies();
		
		if(ck != null)
		{
			for(Cookie cookie : ck)
			{
				pw.println(cookie.getName()+ " : " + cookie.getValue() +"<br>");
			}
		}
		
		pw.println(c5.getName()+ " : " + c5.getValue() +"<br>");
		pw.println(c6.getName()+ " : " + c6.getValue() +"<br>");
	}
}
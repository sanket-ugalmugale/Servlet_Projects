package com.tot.servlet;

import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

@WebServlet("/cookieurl")
public class CookieServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		Cookie ck = new Cookie("first","sanket");
		
		res.addCookie(ck);
		ck.setMaxAge(60);
		
		pw.println("<h1> Cookies are set </h1>");
		pw.println("<h1>" +ck.getMaxAge()+ " seconds</h1>");
	}
}

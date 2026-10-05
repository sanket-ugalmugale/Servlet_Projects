package com.tot.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CapitalServlet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		int stateindex = Integer.parseInt(req.getParameter("state"));
		
		String[] states = {"Maharashtra", "Karnataka", "Gujarat"};
		
		String[] capitals = {"Mumbai", "Bengaluru", "Gandhinagar"};
		
		pw.println("<h1 style='color:green; text-align:center;'> The Capital of " +states[stateindex]+ " is " +capitals[stateindex]+ "</h1>");
		
		pw.println("<div style='text-align:center;'> <a href='page.html'> HOME </a> </div>");
		
		pw.close();
	}
}

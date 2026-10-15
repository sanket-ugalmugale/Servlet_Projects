package com.tot.servlet;

import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

@WebServlet("/request")
public class SessionServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		
		PrintWriter pw = res.getWriter();
		
		String username = req.getParameter("uname");
		String password = req.getParameter("pwd");
		String req1 = req.getParameter("req1");
		String req2 = req.getParameter("req2");
		
		if("request1".equals(req1))
		{
			pw.println("<h1 style='text-align : center;'> Request1 arrived </h1>");
			
			HttpSession hs = req.getSession();
			
			hs.setAttribute("uname",username);
			hs.setAttribute("pwd", password);
			
			RequestDispatcher rd = req.getRequestDispatcher("session.html");
			
			rd.include(req, res);
		}
		
		else if("request2".equals(req2))
		{
			HttpSession hs = req.getSession(false);
			
			if(hs != null)
			{
				String uname = (String) hs.getAttribute("uname");
				String pwd = (String) hs.getAttribute("pwd");
				
				if(uname.equals(username) && pwd.equals(password))
				{	
					pw.println("<h2 style = 'text-align : center'> Username: " +uname+ "</h2>");
					pw.println("<h2 style = 'text-align : center'> Password: " +pwd+ "</h2>");
				}
				else
				{
					pw.println("<h1 style = 'text-align : center'> Invalid User </h1>");
				}
				
				pw.println("<div style = 'text-align : center'> <a href = '/SessionManagement/session.html'> LOGIN </a> </div>");
			}
				
			else
			{
				pw.println("<h1 style = 'text-align : center'> no session found </h1>");
				pw.println("<div style = 'text-align : center'> <a href = '/SessionManagement/session.html'> LOGIN </a> </div>");
			}
		}
	}
}

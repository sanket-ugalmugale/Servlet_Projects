package com.tot.servlet;
import javax.servlet.annotation.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/firsturl")
public class FirstServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		
		PrintWriter pw = res.getWriter();
		
		pw.println("<h1 style = 'text-align : center;'> First Servlet </h1>");
		
		ServletContext context = this.getServletContext();
		RequestDispatcher rd = context.getNamedDispatcher("demo");
		
		//RequestDispatcher rd = req.getRequestDispatcher("secondurl");
		
		req.setAttribute("Sanket", 21);
		
		rd.forward(req, res);
		//rd.include(req, res);
		
		pw.println("<h1 style = 'text-align : center;'> End of First Servlet </h1>");
	}
}

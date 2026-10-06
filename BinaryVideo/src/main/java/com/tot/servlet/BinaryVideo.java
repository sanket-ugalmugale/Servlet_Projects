//without web.xml (using annotation)

package com.tot.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/videourl")
public class BinaryVideo extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		//res.setContentType("video/mp4");
		
		res.setHeader("content-type","video/mp4");
		
		ServletOutputStream sos = res.getOutputStream();
		
		String path = this.getServletContext().getRealPath("bappa.mp4");
		
		File f = new File(path);
		
		FileInputStream fis = new FileInputStream(f);
		
		byte[] b = new byte[(int)f.length()];
		
		fis.read(b);
		
		sos.write(b);
		
		fis.close();
		sos.close();
	}
}


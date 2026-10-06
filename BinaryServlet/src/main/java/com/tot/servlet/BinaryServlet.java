package com.tot.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class BinaryServlet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("image/jpeg");
		
		ServletOutputStream sos = res.getOutputStream(); // Used to send binary data
		
		String path = this.getServletContext().getRealPath("bappa.jpg");   // Gets the path of the image
		
		File f = new File(path); // Creates a File object that points to the image
		
		FileInputStream fis = new FileInputStream(f); // Reads the binary data of the image using FileInputStream
													// The binary data of the image is brought into the program through this stream
		
		// Binary data is stored in the form of bytes, so we create a byte array
		
		byte[] b = new byte[(int)f.length()]; // Stores the binary data in the byte array
											// The array size is set according to the size of the image file
											// length() returns a long value, so it is typecast to int
		
		fis.read(b); // Reads the binary data from the image into the byte array
		sos.write(b); // Writes the binary data and sends it to the browser
	}
}

package com.java2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.ws.api.policy.PolicyResolver.ServerContext;

@WebServlet("/shiv")
public class shiv extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public shiv() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		
		
	/*ServletContext  context= getServletContext();
	String dna=context.getInitParameter("username");
	
	out.println("This "+dna) ;
	*/
	ServletContext con=getServletContext();
	String Name=con.getInitParameter("Passwored");
	
	out.println("This is my contect"+Name);
	
}

}

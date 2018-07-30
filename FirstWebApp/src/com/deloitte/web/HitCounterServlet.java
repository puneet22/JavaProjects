package com.deloitte.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HitCounterServlet
 */
@WebServlet("/hitcount")
public class HitCounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int counter=0;

    /**
     * Default constructor. 
     */
    public HitCounterServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	String name=request.getParameter("name");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("hi " +name);
		out.println("You are user # "+(++counter));
		
		out.println("The IP address is "+ request.getRemoteAddr());
		Enumeration<String> headerNames=request.getHeaderNames();
		String headerName=null;
		while(headerNames.hasMoreElements()) {
			headerName=headerNames.nextElement();
			out.println(headerName+" : "+request.getHeader(headerName)+"< br/>");
		
		}
		ServletConfig config=getServletConfig();
		out.println(config.getInitParameter("email"));
		
		ServletContext context=getServletContext();
		
		
		out.println(context.getInitParameter("Webadmin"));
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get the data
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		long mobileno =Long.parseLong(request.getParameter("mobile"));
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String dob=request.getParameter("dob");
		String[] quals=request.getParameterValues("qualification");
		String country=request.getParameter("country");
		String[] languages=request.getParameterValues("languages");
		String comments=request.getParameter("comments");

		//process the data
		String q=String.join(",",quals);
		String l=String.join("-",languages);
       
         //render the response
		     response.setContentType("text/html");
		     PrintWriter Writer=response.getWriter();
		     Writer.println("<html>");
		     Writer.println("<body bgcolor=pink>");
		     Writer.println("<h1>Registration form.....</h1>");
		     Writer.println("your name is:"+username+"<br><br>");
		     Writer.println("your password:"+password+"<br><br>");
		     Writer.println("your mobilenumber:"+mobileno+"<br><br>");
		     Writer.println("email id:"+email+"<br><br>");
		     Writer.println("Gender:"+gender+"<br><br>");
		     Writer.println("date of birth:"+dob+"<br><br>");
		     Writer.println("qualifiaction:"+q+"<br><br>");
		     Writer.println("country"+country+"<br><br>");
		     Writer.println("langusges known is:"+l+"<br><br>");
		     Writer.println("comments are"+comments);
		     Writer.println("</body>");
		     Writer.println("</html>");




				
				}

}

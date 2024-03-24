package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginformServlet")
public class LoginformServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response, RequestDispatcher requestdispatcher, Object RequestDispatcher) throws ServletException, IOException {
		 String username= request.getParameter("Username");
		 String password= request.getParameter("Password");
		 String status;
		  
		if(username.equals("sathya")&&password.equals("sathya@123"))
		{  
			status="login success" ; 
		}  
		  else
		  {
			  status="login fail";
		  }
		  response.setContentType("text/html");
		  PrintWriter writer=response.getWriter();
		  writer.println("<html>");
		  writer.println("login status...."+status);
		  writer.println("</html>");

	}

}

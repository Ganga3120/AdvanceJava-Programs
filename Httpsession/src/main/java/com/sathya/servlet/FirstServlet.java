package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// get the data
		String username= request.getParameter("Username");
	//int age=Integer.parseInt(request.getParameter("Age"));
		String age=request.getParameter("Age");
	//create the httpsession object
	//HttpSession session=request.getSession();
	 //place the data into session object
	//session.setAttribute("Username",username);
	//session.setAttribute("Age",age);
	Cookie cookie1=new Cookie("Username",username);
	Cookie cookie2=new Cookie("Age",age);
	//add the cookies to response
	response.addCookie(cookie1);
	response.addCookie(cookie2);
// give the form to client
	 RequestDispatcher dispatcher=request.getRequestDispatcher("form2.html");
	   dispatcher.forward(request, response);
	}

}

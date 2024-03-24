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


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String qualification=request.getParameter("Qualification");
		String designation=request.getParameter("Designation");
		//HttpSession session=request.getSession(false);
		//session.setAttribute("Qualification",qualification);
		//session.setAttribute("Designation",designation);
		Cookie cookie3=new Cookie("Qualification",qualification);
		Cookie cookie4=new Cookie("Designation",designation);
		//add the response
		response.addCookie(cookie3);
		response.addCookie(cookie4);
		RequestDispatcher dispatcher=request.getRequestDispatcher("form3.html");
		   dispatcher.forward(request, response);
		}

	}



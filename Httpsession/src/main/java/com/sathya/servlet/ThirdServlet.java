package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//HttpSession session=request.getSession(false);
		Cookie[] cookies=request.getCookies();
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<body style='color:green'>");
		writer.println("<pre>");
		writer.println("Username...."+cookies[0].getValue());
		writer.println("Age...."+cookies[1].getValue());
		writer.println("Qualification..."+cookies[2].getValue());
		writer.println("designation..."+cookies[3].getValue());
		//writer.println("Username...."+session.getAttribute("Username"));
		//writer.println("Age...."+session.getAttribute("Age"));
		//writer.println("Qualification..."+session.getAttribute("Qualification"));
		//writer.println("designation..."+session.getAttribute("Designation"));
		writer.println("emailid.."+request.getParameter("Email"));
		writer.println("mobile number....."+request.getParameter("Mobile"));
		writer.println("</pre>");
		writer.println("</body>");
		writer.println("</html>");


	}

}

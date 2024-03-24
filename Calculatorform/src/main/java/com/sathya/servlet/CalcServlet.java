package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.Normalizer.Form;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get the data
		int num1=Integer.parseInt(request.getParameter("first"));
		int num2=Integer.parseInt(request.getParameter("second"));
		String operation=request.getParameter("operation");
       //process data
		int result=0;
			switch(operation)
			{
			case "+":result=num1+num2;
			          break;
			case "-":result=num1-num2;
			      break;
			case "*":result=num1*num2;
			      break;
			case  "/": result=num1/num2;
			    break;
			case  "%":result=num1%num2;
			         break;
			}
		   response.setContentType("text/html");
		   PrintWriter Writer=response.getWriter();
		   Writer.println("<html>");
		   Writer.println("<body bgcolor=pink>");
		   Writer.println("<h1>Calculations Form...</h1><br>");
		   Writer.println("first number........."+num1+"<br><br>");
		   Writer.println("second number ........"+num2+"<br><br>");
		   Writer.println("operator symbol is......."+operation+"<br><br>");
		   Writer.println("response is......."+result);
		   Writer.println("</body>");
		   Writer.println("</html>");

		   
	}	
	}



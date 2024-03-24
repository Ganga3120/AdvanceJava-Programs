package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SalaryServlet")
public class SalaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  //get the request
		int empid= Integer.parseInt(request.getParameter("emp id")); 
		String name=request.getParameter("emp name");
		double sal=Double.parseDouble(request.getParameter("Salary"));
		//process the data
		double hra,da,pf,gsal;
		if(sal>=50000)
		{
			hra=sal*0.3;
		    da=sal*0.1;
		    pf=sal*0.06;
	    }
		else if(sal>=25000&&sal<50000)
		{
			hra=sal*0.2;
			da=sal*0.05;
			pf=sal*0.03;
		}
		  else
		  {
			  hra=sal*0.1;
			  da=sal*0.03;
			  pf=sal*0.02;
		  }
			gsal=sal+hra+da+pf;
			// render the response
			response.setContentType("text/html");
			PrintWriter writer=response.getWriter();
			writer.println("<html>");
			writer.println("<body bgcolor=orange>");
			writer.println("<h1>Employee salary details........</h1>");
			writer.println("employee id :"+empid+"<br><br>");
			writer.println("employee name :"+name+"<br><br>");
			writer.println("salary is"+sal+"<br><br>");
			writer.println("HRA AMOUNT  :"+hra+"<br><br>");
			writer.println("DA AMOUNT  :"+da+"<br><br>");
			writer.println("PF AMOUNT  :"+pf+"<br><br>");
			writer.println("GROSS SALARY  :"+gsal+"<br><br>");
			writer.println("</body>");
			writer.println("</html>");
	}
	}



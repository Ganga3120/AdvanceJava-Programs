package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //step 1 to get the data
		 int proid= Integer.parseInt(request.getParameter("Pro id"));
		String proname=request.getParameter("Pro name");
		  double proprice= Double.parseDouble(request.getParameter("Pro price"));
		   int proquantity=Integer.parseInt(request.getParameter("Pro quantity"));
		   //step 2 process the data
		   double totalbill,dis=0,netamount=0;
		    totalbill=proprice*proquantity;
		    if(totalbill<1000)
		    {
		    	 dis=0;
		      netamount=totalbill;
		    }
		    else if(totalbill>1000&&totalbill<5000)
		    {
		    	 dis=totalbill*(0.5);
		       netamount=totalbill-dis;
		    }
		    else if(totalbill>5000&&totalbill<1000)
		    {
		    	 dis=totalbill*1.0;
		    	netamount=totalbill-1.0;
		    }
		    else 
		    {
		    	 dis=totalbill-1.5;
		    	netamount=totalbill-1.5;
		    }
		    
		    //render the response
		    response.setContentType("text/html");
		    PrintWriter  writer=response.getWriter();
		   writer .println("<html>");
		   writer .println("<body bgcolor=pink>");
		   writer .println("<h1>Product form</h1>");
		    writer.println("productid="+proid+"<br><br>");
		    writer.println("productname="+proname+"<br><br>");
		    writer.println("productprice="+proprice+"<br><br>");
		    writer.println("productquantity="+proquantity+"<br><br>");
		    writer.println("totalbill="+totalbill+"<br><br>");
		    writer.println("discount="+dis+"<br><br>");
		    writer.println("netamount="+netamount+"<br><br>");
		    writer .println("</html>");
		    writer.println("</body>");
		    
	}

}

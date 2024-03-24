package com.sathya.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;

@WebServlet("/AddProductServlet")
@MultipartConfig
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// read the data from form
		String proid=request.getParameter("proid");
		String  proname=request.getParameter("proname");
		double proprice=Double.parseDouble(request.getParameter("proprice"));
		String  probrand=request.getParameter("probrand");
		String promadein=request.getParameter("madein");
		Date mnfdate=Date.valueOf(request.getParameter("manufactutedate"));
		Date expdate=Date.valueOf(request.getParameter("expirydate"));
		
		Part part=request.getPart("image");
		InputStream inputstream=part.getInputStream();
		byte[] proimage= IOUtils.toByteArray(inputstream);
		
		Part part1=request.getPart("proaudio");
		InputStream stream=part1.getInputStream();
		byte[] proaudio=IOUtils.toByteArray(stream);
		
		Part part2=request.getPart("provideo");
		InputStream stream1=part2.getInputStream();
		  byte[] provideo=IOUtils.toByteArray(stream1);
		
	
		Product product=new Product();
		 product.setPid(proid);
		 product.setProname(proname);
		 product.setProprice(proprice);
		 product.setProbrand(probrand);
		 product.setPromadein(promadein);
		 product.setPromnfdate(mnfdate);
		 product.setProexpdate(expdate);
		 product.setProImage(proimage);
		 product.setProaudio(proaudio);
		 product.setProvideo(provideo);
		 
		
		 
		 ProductDao1 productdao1=new ProductDao1();
				int result=productdao1.save(product);
				if(result==1)
				{
					  // rsssead the data and send to request
					   request.setAttribute("saveResult",result);
					RequestDispatcher dispatcher=request.getRequestDispatcher("productlist.jsp");
					dispatcher.forward(request, response);
				}
				else
				{
					response.setContentType("text/html");
					PrintWriter writer=response.getWriter();
					writer.println("data insertion fail.."+result);
					RequestDispatcher dispatcher=request.getRequestDispatcher("add-product.html");
					  dispatcher.include(request, response);
				}
		    	
	}
	
	}



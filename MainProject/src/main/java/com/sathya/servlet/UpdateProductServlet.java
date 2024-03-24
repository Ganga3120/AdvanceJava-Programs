package com.sathya.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Base64;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;

@WebServlet("/UpdateProductServlet")
@MultipartConfig
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String proid=request.getParameter("proid");
		String  proname=request.getParameter("proname");
	    double proprice=Double.parseDouble(request.getParameter("proprice"));
		String  probrand=request.getParameter("probrand");
		String promadein=request.getParameter("madein");
		Date mnfdate=Date.valueOf(request.getParameter("manufactureddate"));
		Date expdate=Date.valueOf(request.getParameter("expirydate"));
		Product product=new Product();
		product.setPid(proid);
		product.setProname(proname);
	    product.setProprice(proprice);
		product.setProbrand(probrand);
		product.setPromadein(promadein);
		product.setPromnfdate(mnfdate);
		product.setProexpdate(expdate);
		Part filepart=request.getPart("newimage");
		if(filepart!=null&&filepart.getSize()>0)
		{
			InputStream inputstream=filepart.getInputStream();
			byte[] newImageData=IOUtils.toByteArray(inputstream);
			product.setProImage(newImageData);

		}
		else
		{
		   String s=request.getParameter("existingimage");
		   byte[] existingimage=Base64.getDecoder().decode(s);
		   product.setProImage(existingimage);
		}
		
		   String s1=request.getParameter("existingaudio");
		   byte[] existingaudio=Base64.getDecoder().decode(s1);
		   product.setProaudio(existingaudio);
		   String s2=request.getParameter("existingvideo");
		   byte[] existingvideo=Base64.getDecoder().decode(s2);
		   product.setProvideo(existingvideo);
	
		
		ProductDao1 dao=new ProductDao1();
		int result=dao.UpdateById(product);
		  if(result==1)
		  {
			  RequestDispatcher dispatcher=request.getRequestDispatcher("productlist.jsp");
			  dispatcher.forward(request, response);
		  }
		  else
		  {
			  response.setContentType("text/html");
			  PrintWriter writer=response.getWriter();
			  writer.println("data updation fail please check once..");
			  RequestDispatcher dispatcher=request.getRequestDispatcher("productlist.jsp");
			  dispatcher.forward(request, response);
			  }
	}

}

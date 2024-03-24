package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NumberServlet")
public class NumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        ArrayList<Integer> al=new ArrayList<Integer>();

        int n1=Integer.parseInt(request.getParameter("start"));
        int n2=Integer.parseInt(request.getParameter("end"));
        String operation=request.getParameter("opetation");
        //process the data
          switch(operation) 
          {
          case "Even": 
        	  for(int i=n1;i<=n2;i++)
        	  {
        		  if(i%2==0)
        			  al.add(i);
        		 
        	  }
        	   break;
       case "odd":
        	  for(int i=n1;i<=n2;i++)
        	  {
        		  if(i%2!=0)
        			  al.add(i);
        		   
        	  }
        	  break;
         case "prime":
        	   int count=0;
        	  for(int i=n1;i<=n2;i++)
        	  {
        		  count=0;
        		  for(int j=1;j<=i;j++)
        		  {
        			  if(i%j==0)
        				  count++;
        		  }
        		  if(count==2)
        			  al.add(i);
        		   
        	  }
        	   break;
         case "perfect":
        	  int sum=0;
        	  for(int i=n1;i<=n2;i++)
        	  { 
        		  sum=0;
        		  for(int j=1;j<i;j++)
        		  {
        				if(i%j==0)
        					sum=sum+j;
        				   }
        		   if(sum==i)
        			   al.add(i);
        		    
        		   }
        	  break;
          case "strong":
        	  int fact=1,sum1=0,temp1,rem;
        	  for(int i=n1;i<=n2;i++)
        	  {
        		  temp1=i;
        		  sum1=0;
        		   while(temp1>0)
        		   {
        			   rem=temp1%10;
        		  
        		     if(rem==0)
        		    	 fact=1;
        		     else
        			    {
        		    	   fact=1;
        			    	for(int j=1;j>=1;j++)
        			    		fact=fact*j;
        			    }
        			    sum1=sum1+fact;
        			    temp1=temp1/10;
        		  }
        		  if(sum1==i)
        			  al.add(i);
        		  
        	  }
        	    break;
         case "armstrong":
        	  int temp,temp2,rem1,sum2=0,count1=0,x,y;
        	  for(int i=n1;i<=n2;i++)
        	  {
        		  temp=i;
        		  sum2=0;
        		  count1=0;
        		  while(temp>0)
        		  {
        			  temp=temp/10;
        			  count1++;
        		  }
        		  temp2=i;
        		  
        		  while(temp2>0)
        		  {
        			  rem=temp2%10;
        			  y=count1;
        		     x=1;
        			  while(y>0)
        			  {
        				  x=x*rem;
        			    y--;
        		  }
        	  sum2=sum2+x;
        	  temp2=temp2/10;
        	  }
            if(sum2==i)
            	al.add(i);
              
          }
          break;
          }
        //step 3 render the response
        	  response.setContentType("text/html");
        	  PrintWriter writer=response.getWriter();
        	  writer.println("<html>");
        	  writer.println("<body bgcolor=yellow>");
        	  writer.println("<h1>Calculations.......</h1>");
        	  writer.println("the number series is..."+al);
              writer.println("</body>");
        	  writer.println("<html>");

	}
	}



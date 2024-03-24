package fullname;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/FullnameServlet")
public class FullnameServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String  name1=request.getParameter("firstname");
			String name2= request.getParameter("middlename");
			String name3= request.getParameter("lastname");
		    String status;
		    if((name1.equals("Ganga")&&(name2.equals("Bhavani")&&(name3.equals("Kolluboina")))))
		    {
		    	status=name1+" "+name2+" "+name3;
		    }
		    else
		    {
		    	status="invalid name";
		    }
		    PrintWriter writer=response.getWriter();
		    response.setContentType("text/html");
		    writer.println("<html>");
		    writer.println("<h1>Your full name .....</h1>"+status);
		    writer.println("</html>");
	 
	}

}

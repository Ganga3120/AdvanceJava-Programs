package HelloWorldapp1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/bhavani")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public HelloWorldServlet() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//  response.getWriter().append("served at:").append(request.getContextPath());
		  PrintWriter writer=response.getWriter();
		 response.setContentType("text/plain");
		  writer.println("<html>");
		writer.println("<h1>welcome to sathya tech</h1>");
		writer.println("<h2>welcome to java classes</h2>");
		writer.println("<h3>weicome to ratan sir classes</h3>");
		writer.println("</html>");
	}
}


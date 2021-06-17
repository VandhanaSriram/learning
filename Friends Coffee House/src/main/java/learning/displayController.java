package learning;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/displayController")
public class displayController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page");
		page = page.toLowerCase();
		response.setContentType("text/html"); 
		
		switch(page) {
		case "home":
			response.sendRedirect("http://localhost:8080/Friends_Coffee_House/index.html");
			break;
		default:
			response.sendRedirect("http://localhost:8080/Friends_Coffee_House/error.html");
		}
	}
}

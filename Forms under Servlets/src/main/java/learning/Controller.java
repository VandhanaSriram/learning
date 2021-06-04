package learning;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().print("Form data handled in doGet() method" +"<br>");
		response.getWriter().print("Name: " +request.getParameter("name") +"<br>");
		response.getWriter().print("Gender: " +request.getParameter("gender") +"<br>");
		String[] languages = request.getParameterValues("lang");
		response.getWriter().print("Languages: ");
		if(languages !=null) {
			for(int i=0; i<languages.length; i++) {
				response.getWriter().print("<br>");
				response.getWriter().print(languages[i]);
			}
		}
		else {
			response.getWriter().print("No languages selected");
		}
		response.getWriter().print("<br>");
		response.getWriter().print("Country: " +request.getParameter("country"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().print("Form data handled in doPost() method" +"<br>");
		response.getWriter().print("Name: " +request.getParameter("name") +"<br>");
		response.getWriter().print("Gender: " +request.getParameter("gender") +"<br>");
		String[] languages = request.getParameterValues("lang");
		response.getWriter().print("Languages: ");
		if(languages !=null) {
			for(int i=0; i<languages.length; i++) {
				response.getWriter().print("<br>");
				response.getWriter().print(languages[i]);
			}
		}
		else {
			response.getWriter().print("No languages selected");
		}
		response.getWriter().print("<br>");
		response.getWriter().print("Country: " +request.getParameter("country"));
	}

}

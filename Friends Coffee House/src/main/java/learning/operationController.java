package learning;

import learning.model.*;
import learning.entity.Menu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/operationController")
public class operationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	@Resource(name="jdbc/project")
	private DataSource dataSource;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page");
		page = page.toLowerCase();
		response.setContentType("text/html"); 
		
		switch(page) {
			case "menu":
				listMenu(request, response);
				break;
			case "additem":
				addItem(request, response);
				break;
			default:
				response.sendRedirect("http://localhost:8080/Friends_Coffee_House/error.html");
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String form = req.getParameter("form");
		resp.getWriter().print(form);
		switch(form) {
			case "addItem":
				String item = req.getParameter("item");
				String category = req.getParameter("category");
				String amt = req.getParameter("price");
				double price = Double.parseDouble(amt);
				Menu addMenuObj = new Menu(item, category, price);
				ShopModel shop = new ShopModel();
				boolean operation = shop.addMenu(dataSource, addMenuObj);
				listMenu(req, resp);
				
				break;
			default:
				resp.sendRedirect("http://localhost:8080/Friends_Coffee_House/error.html");
		}
		

	}
	
	public void listMenu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Menu> menu = new ArrayList<>();
		ShopModel shop = new ShopModel();
		menu = shop.listMenu(dataSource);
		request.setAttribute("menuList", menu);
		request.getRequestDispatcher("menu.jsp").forward(request, response);
	}
	
	public void addItem(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("AddItem.jsp").forward(request, response);
	}

}

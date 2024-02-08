package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAO;

@WebServlet(urlPatterns= {"/Controller","/lanches"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO con = new DAO();
	
    public Controller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		if(action.equals("/lanches")) {
			this.lanches(request, response);
		}
	}
	protected void lanches(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("Lanches.jsp");
	}

}

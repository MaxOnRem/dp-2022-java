package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import crud.Lab2CrudInterface;
import table.Table;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class TableServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ServletConfigInterface servletConfig;
	Lab2CrudInterface lab2Crud;
	
	public TableServlet1() {
		super();
		this.servletConfig = new ServletConfig();
		this.lab2Crud = servletConfig.getCrud();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		
		out.println("["+lab2Crud.readTable()+"]");
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		int width = Integer.parseInt(request.getParameter("width"));
		float height = Float.parseFloat(request.getParameter("height"));
		
		lab2Crud.updateTable(new Table(title, width, height));
	}

}


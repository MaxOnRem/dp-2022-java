package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import crud.Lab2CrudInterface;

/**
 * Servlet implementation class TableServlet1
 */
public class TableServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ServletConfigInterface servletConfig;
	;
	Lab2CrudInterface lab2Crud;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TableServlet1() {
        super();
        
        this.servletConfig = new ServletConfig();
        this.lab2Crud = servletConfig.getCrud();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		out.println("["+lab2Crud.readTable()+"]");
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ConcreteCalculator;
/**
 * Servlet implementation class ConcreteServlet
 */
@WebServlet(description ="/ConcreteServlet", urlPatterns = {"/convert"})
public class ConcreteServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConcreteServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// get the inputs from the request object
		double length= Double.parseDouble(request.getParameter("length"));
		double width= Double.parseDouble(request.getParameter("width"));
		double depth= Double.parseDouble(request.getParameter("depth"));

		String unit = request.getParameter("unit");
		
		
		//process inputs to get outputs
		
		ConcreteCalculator Cc = new ConcreteCalculator(length, width, depth, unit);
		
		// send data and control to the view
		
		Cc.getVolume();
		Cc.getBagCount();
		Cc.getCost();
		
		// the result
		String result= Cc.getCalculationHTML();
		
		// add the result String to the request object
		
		request.setAttribute("result", result);
		
		System.out.println(result);

		String url = "/convert.jsp";

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);  // set up dispatcher to go to the view
		dispatcher.forward(request, response);  // send control (and request/response objects to the view

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

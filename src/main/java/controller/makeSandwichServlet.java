package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.formatSandwich;

/**
 * Servlet implementation class makeSandwichServlet
 */
@WebServlet("/makeSandwichServlet")
public class makeSandwichServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public makeSandwichServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String sandwichToppings = request.getParameter("sandwichToppings");

        PrintWriter writer = response.getWriter();
        writer.println("Hair's yo-wr formatted sayndwich, enjoy!");
        writer.println();
        formatSandwich.printSandwich(sandwichToppings, writer);
        writer.close();
    }




}

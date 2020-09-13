package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloWorld() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		checkParameter(request, response);
	}

	private void checkParameter(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String user = request.getParameter("user");
		String password = request.getParameter("password");

		ServletContext context = this.getServletContext();
		String name = context.getInitParameter("name");
		String friend = context.getInitParameter("friend");

		if (user.equals("quyet") && password.equals("quyet")) {
			HttpSession session = request.getSession();
			session.setAttribute("user", name);

			Image image = new Image("Harry Poster", 200.0, 800.0);
			request.setAttribute("imageName", image);

			session.setAttribute("Testing session", new Image("Harry", 200.0, 800.0));
			session.removeAttribute("Testing session");
			RequestDispatcher dispatch = request.getRequestDispatcher("/imageShow");
			dispatch.forward(request, response);

		} else {

			RequestDispatcher dispatch = request.getRequestDispatcher("/Login.jsp");
			dispatch.forward(request, response);

		}
	}

}

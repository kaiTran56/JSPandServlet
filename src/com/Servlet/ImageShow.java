package com.Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ImageShow
 */

public class ImageShow extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ImageShow() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doCheck(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doCheck(request, response);
		
	}

	private void doCheck(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String user = (String)session.getAttribute("user");
		String password = (String)session.getAttribute("password");
		response.addCookie(new Cookie("Location", "VietNam"));
		if(user==null||password==null) {
			RequestDispatcher dispatcher =  request.getRequestDispatcher("/Login.jsp");
			dispatcher.forward(request, response);
		}else {
			this.getServletContext().setAttribute("application", "APPLICATION_SCOPE");
			session.setAttribute("ses", "Scope_Session");
			request.setAttribute("othe", "Scope_Friends");
			Student student = new Student();
			student.setName("Quyet");
			request.setAttribute("student", student);
			RequestDispatcher dispatcher =  request.getRequestDispatcher("/Images.jsp");
			dispatcher.forward(request, response);
			
			List<String> languages = new ArrayList<String>();
			languages.add("Color");
			languages.add("Bitch");
			request.setAttribute("list", languages);
			Student bean1 = new Student();
			bean1.setName("QuyetKai");
			request.setAttribute("bean1", bean1);
			
			
			for(Cookie c : request.getCookies()) {
				System.out.println(c.getName());
				System.out.println(c.getValue());
			}
		}
	}

}

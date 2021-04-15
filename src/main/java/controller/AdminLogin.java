package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.AdminDao;
import dao.AdminDaoImpl;

/**
 * Servlet implementation class AdminLogin
 */
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static AdminDao adao = new AdminDaoImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		if (adao.checkAdmin(email, password)) {
			session.setAttribute("email", email);
			session.setAttribute("password", password);

			response.sendRedirect("adminHome.html");

		} else {
			response.sendRedirect("index.jsp");

		}
	}

}

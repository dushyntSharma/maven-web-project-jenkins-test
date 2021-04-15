package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.StudentDao;
import dao.StudentDaoImpl;

/**
 * Servlet implementation class loginStudent
 */
public class loginStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static StudentDao dao = new StudentDaoImpl();

	public loginStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		if (dao.checkUser(email, password)) {
			session.setAttribute("email", email);
			session.setAttribute("password", password);
			// RequestDispatcher rs = request.getRequestDispatcher("home.html");
			// rs.forward(request, response);
			response.sendRedirect("studentHome.jsp");

		} else {
			response.sendRedirect("index.jsp");

//			RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
//			rs.include(request, response);
		}
	}

}

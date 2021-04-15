package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.StaffDao;
import dao.StaffDaoImpl;

/**
 * Servlet implementation class loginStaff
 */
public class loginStaff extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static StaffDao dao = new StaffDaoImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginStaff() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		if (dao.checkStaff(email, password)) {
			session.setAttribute("email", email);
			session.setAttribute("password", password);
			// RequestDispatcher rs = request.getRequestDispatcher("home.html");
			// rs.forward(request, response);
			response.sendRedirect("staffhome.html");

		} else {
			response.sendRedirect("index.jsp");

//			RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
//			rs.include(request, response);
		}
	
	}

}

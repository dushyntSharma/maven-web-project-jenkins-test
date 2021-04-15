package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import dao.StudentDaoImpl;
import model.Student;

/**
 * Servlet implementation class RegisterFromAdmin
 */
public class RegisterFromAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static StudentDao dao = new StudentDaoImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterFromAdmin() {
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

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		short age = (short) Integer.parseInt(req.getParameter("age"));
		String address = req.getParameter("address");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String country = req.getParameter("country");
		int pincode = Integer.parseInt(req.getParameter("pincode"));
		String email = req.getParameter("email");
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		Student std = new Student(name, age, address, city, state, country, pincode, email, username, password);
		List<Student> st = new ArrayList<Student>();
		st.add(std);
		try {
			dao.registerStudents(st);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		RequestDispatcher rd = req.getRequestDispatcher("/adminHome.html");
		rd.forward(req, res);

	}

}

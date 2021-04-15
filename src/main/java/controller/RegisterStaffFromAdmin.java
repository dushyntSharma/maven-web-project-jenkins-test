package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StaffDao;
import dao.StaffDaoImpl;
import model.Staff;

/**
 * Servlet implementation class RegisterStaffFromAdmin
 */
public class RegisterStaffFromAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static StaffDao sdao = new StaffDaoImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterStaffFromAdmin() {
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
		RequestDispatcher rd = request.getRequestDispatcher("/RegisterStaffFromAdmin");
		rd.forward(request, response);
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

		Staff std = new Staff(name, age, address, city, state, country, pincode, email, username, password);
		List<Staff> st = new ArrayList<Staff>();
		st.add(std);
		try {
			sdao.registerStudents(st);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		RequestDispatcher rd = req.getRequestDispatcher("/adminHome.html");
		rd.forward(req, res);

	}

}

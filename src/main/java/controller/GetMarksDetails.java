package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.DBConnection;

/**
 * Servlet implementation class GetMarksDetails
 */

public class GetMarksDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 * 
	 *      public GetMarksDetails() { super(); // TODO Auto-generated constructor
	 *      stub }
	 * 
	 *      /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection con = DBConnection.getConnection();
		String sql = "select * from marks";
		response.setContentType("text/html");
		PreparedStatement st = null;
		ResultSet res = null;
		try {
			st = con.prepareStatement(sql);
			res = st.executeQuery();
			PrintWriter out = response.getWriter();
			out.println("<html><link rel=\"stylesheet\" type=\"text/css\" href=\"./style.css\" /><style>"
					+ "tr,td{background-color: white;" + "  padding: 15px;\r\n"
					+ "  text-align: left;} </style><body><center><table border = '1'><tr><td>email</td><td>jdbc</td><td>jsp</td><td>servlet</td></tr>");
			while (res.next()) {
				out.println("<tr><td>" + res.getString(1) + "</td><td>" + res.getString(2) + "</td><td>"
						+ res.getString(3) + "</td><td>" + res.getString(4) + "</td></tr>");

			}
			out.println("</table></center><a href=\"studentHome.jsp\">Back</a></body></html>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (res != null) {
					res.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (st != null) {
					st.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}

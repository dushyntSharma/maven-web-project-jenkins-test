//package controller;
//
//import java.io.ByteArrayOutputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import utility.DBConnection;
//
///**
// * Servlet implementation class AddVideoFromStaff
// */
//public class AddVideoFromStaff extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	public AddVideoFromStaff() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//		Connection con = DBConnection.getConnection();
//		File file = new File("D:\\Script Workspace\\ClassRoomWeb\\RESTapi.mp4");
//		@SuppressWarnings("resource")
//		FileInputStream fileInputStream = new FileInputStream(file);
//		ByteArrayOutputStream out = new ByteArrayOutputStream();
//		while (fileInputStream.available() > 0) {
//			out.write(fileInputStream.read());
//		}
//		byte[] jpgByteArray = out.toByteArray();
//		String query = "insert into sessions(name, video) values (?, ?)";
//		PreparedStatement ps = null;
//		try {
//
//			ps = con.prepareStatement(query);
//			ps.setString(1, "name");
//			ps.setBytes(2, jpgByteArray);
//			ps.executeUpdate();
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} finally {
//			try {
//				fileInputStream.close();
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//		}
//
//	}
//}

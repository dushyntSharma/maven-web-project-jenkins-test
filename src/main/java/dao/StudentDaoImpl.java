package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import model.Student;
import utility.DBConnection;

public class StudentDaoImpl implements StudentDao {

	@Override
	public void registerStudents(List<Student> st) {
		// TODO Auto-generated method stub
		Connection con = DBConnection.getConnection();
		PreparedStatement pt = null;
		String query = "insert into student(name, age, address, city, state, country, pincode, email, username, password) values(?,?,?,?,?,?,?,?,?,?);";
		Student s = st.get(0);
		try {
			pt = con.prepareStatement(query);
			pt.setString(1, s.getName());
			pt.setShort(2, s.getAge());
			pt.setString(3, s.getAddress());
			pt.setString(4, s.getCity());
			pt.setString(5, s.getState());
			pt.setString(6, s.getCountry());
			pt.setInt(7, s.getPincode());
			pt.setString(8, s.getEmail());
			pt.setString(9, s.getUsername());
			pt.setString(10, s.getPassword());
			pt.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {

			try {
				if (pt != null) {
					pt.close();
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

	public boolean checkUser(String email, String password) {
		boolean st = false;
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = null;
		String query = "select * from student where email=? and password=?";
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			st = rs.next();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (ps != null) {
					ps.close();
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
		return st;
	}

}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Staff;
import model.Student;
import utility.DBConnection;

public class EditValues {
	public Student getValues(String email) {
		Connection con = DBConnection.getConnection();
		PreparedStatement pt = null;
		ResultSet res = null;
		Student s = new Student();
		String sql = "select * from student where email=?";
		try {
			pt = con.prepareStatement(sql);
			pt.setString(1, email);
			res = pt.executeQuery();
			while (res.next()) {
				s.setName(res.getString("name"));
				s.setAge(res.getShort("age"));
				s.setAddress(res.getString("address"));
				s.setCity(res.getString("city"));
				s.setState(res.getString("state"));
				s.setCountry(res.getString("country"));
				s.setPincode(res.getInt("pincode"));
				s.setEmail(res.getString("email"));
				s.setUsername(res.getString("username"));
				s.setPassword(res.getString("password"));

			}
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
		return s;

	}

	public void editStudent(Student st) {
		Connection con = DBConnection.getConnection();
		PreparedStatement pt = null;

		String sql = "update student set name=?,age=?,address=?,city=?,state=?,country=?,pincode=?,username=?,password=? where email=?";
		try {
			pt = con.prepareStatement(sql);
			pt.setString(1, st.getName());
			pt.setShort(2, st.getAge());
			pt.setString(3, st.getAddress());
			pt.setString(4, st.getCity());
			pt.setString(5, st.getState());
			pt.setString(6, st.getCountry());
			pt.setInt(7, st.getPincode());
			pt.setString(8, st.getUsername());
			pt.setString(9, st.getPassword());
			pt.setString(10, st.getEmail());

			pt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
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

	public Staff getStaffValues(String email) {
		Connection con = DBConnection.getConnection();
		PreparedStatement pt = null;
		ResultSet res = null;
		Staff s1 = new Staff();
		String sql = "select * from staff where email=?";
		try {
			pt = con.prepareStatement(sql);
			pt.setString(1, email);
			res = pt.executeQuery();
			while (res.next()) {
				s1.setName(res.getString("name"));
				s1.setAge(res.getShort("age"));
				s1.setAddress(res.getString("address"));
				s1.setCity(res.getString("city"));
				s1.setState(res.getString("state"));
				s1.setCountry(res.getString("country"));
				s1.setPincode(res.getInt("pincode"));
				s1.setEmail(res.getString("email"));
				s1.setUsername(res.getString("username"));
				s1.setPassword(res.getString("password"));

			}
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
		return s1;

	}

	public void editStaff(Staff st) {
		Connection con = DBConnection.getConnection();
		PreparedStatement pt = null;

		String sql = "update staff set name=?,age=?,address=?,city=?,state=?,country=?,pincode=?,username=?,password=? where email=?";
		try {
			pt = con.prepareStatement(sql);
			pt.setString(1, st.getName());
			pt.setShort(2, st.getAge());
			pt.setString(3, st.getAddress());
			pt.setString(4, st.getCity());
			pt.setString(5, st.getState());
			pt.setString(6, st.getCountry());
			pt.setInt(7, st.getPincode());
			pt.setString(8, st.getUsername());
			pt.setString(9, st.getPassword());
			pt.setString(10, st.getEmail());

			pt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
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

}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Staff;
import utility.DBConnection;

public class GetStaff {
	public List<Staff> getStaff() {
		Connection con = DBConnection.getConnection();
		PreparedStatement pt = null;
		ResultSet res = null;
		List<Staff> s = new ArrayList<Staff>();
		String query = "select * from staff;";
		try {
			pt = con.prepareStatement(query);
			res = pt.executeQuery();
			while (res.next()) {
				String name = res.getString("name");
				short age = (short) Integer.parseInt(res.getString("age"));
				String address = res.getString("address");
				String city = res.getString("city");
				String state = res.getString("state");
				String country = res.getString("country");
				int pincode = Integer.parseInt(res.getString("pincode"));
				String email = res.getString("email");
				String username = res.getString("username");
				String password = res.getString("password");
				Staff s1 = new Staff(name, age, address, city, state, country, pincode, email, username, password);
				s.add(s1);
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

}

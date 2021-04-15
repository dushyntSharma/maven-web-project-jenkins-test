package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utility.DBConnection;

public class DeleteStaff {
	public void deleteStaff(String email) {
		Connection con = DBConnection.getConnection();
		PreparedStatement pt = null;
		String sql = "delete from staff where email=?";
		try {
			pt = con.prepareStatement(sql);
			pt.setString(1, email);
			pt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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

}

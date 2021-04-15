package dao;

import java.util.List;

import model.Staff;

public interface StaffDao {

	void registerStudents(List<Staff> st);

	boolean checkStaff(String email, String password);

}

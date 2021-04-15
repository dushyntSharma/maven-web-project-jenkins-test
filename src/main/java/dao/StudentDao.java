package dao;

import java.util.List;

import model.Student;

public interface StudentDao {

	void registerStudents(List<Student> st);

	boolean checkUser(String email, String password);

}

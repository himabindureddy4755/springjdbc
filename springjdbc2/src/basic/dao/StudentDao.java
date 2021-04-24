package basic.dao;

import java.util.ArrayList;
import java.util.List;

import basic.model.Student;

public interface StudentDao {
	// void insert(Student student);
	// void insert(Student myStudent);
	// void delRecordById(int id);
	
	//int delRecordByNameSem(String studentName, int sem);
	 public List<Student> getAllStudents();
	void insert(List<Student> students);
}
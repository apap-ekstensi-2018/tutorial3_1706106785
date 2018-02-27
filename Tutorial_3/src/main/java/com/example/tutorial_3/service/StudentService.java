package com.example.tutorial_3.service;

import java.util.List;
import com.example.tutorial_3.model.StudentModel;

public interface StudentService {
	StudentModel selectStudent(String npm);
	
	List<StudentModel> selectAllStudents();
	void addStudent(StudentModel student);
}

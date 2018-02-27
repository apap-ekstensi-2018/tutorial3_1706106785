package com.example.tutorial_3.service;

import java.util.*;
import com.example.tutorial_3.model.*;

public class InMemoryStudentService implements StudentService{
	private static List<StudentModel> studentList = new ArrayList<StudentModel>();

	@Override
	public StudentModel selectStudent(String npm)
	{
		//implement
		return null;
	}
	
	@Override
	public List<StudentModel> selectAllStudents()
	{
		return studentList;
	}
	
	@Override
	public void addStudent(StudentModel student)
	{
		studentList.add(student);
	}
	
}

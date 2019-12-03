package com.studentdemo.query.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.studentdemo.query.model.Student;

@Service
public class StudentService {

//	public List<Student> getAllStudents() { return null; }
	 
	public List<Student> getAllStudents() {
		List <Student> studentList=new ArrayList<Student>();
		studentList.add(new Student(1,"Alex","L2Support"));
		studentList.add(new Student(1,"Suresh","DT"));
		return studentList;
	}
}

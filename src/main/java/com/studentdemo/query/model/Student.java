package com.studentdemo.query.model;

public class Student {
	
	private int studentId;
	private String studentName;
	private String depName;

	public Student(int studentId, String studentName, String depName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.depName = depName;
	}
	public Student() {
		super();
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

}

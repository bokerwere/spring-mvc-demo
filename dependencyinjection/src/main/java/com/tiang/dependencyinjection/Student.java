package com.tiang.dependencyinjection;

public class Student {
	private String studentName;
	private int id;
	
	
	
	
	public void display() {
		System.out.println("student name="+studentName+"student id is:"+id);
	}


public Student(int id) {
	this.id=id;
}

	public Student(String studentName, int id) {
		super();
		this.studentName = studentName;
		this.id = id;
	}
	
	
 
	
}

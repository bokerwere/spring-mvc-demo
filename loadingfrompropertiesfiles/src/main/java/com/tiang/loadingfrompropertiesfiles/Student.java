package com.tiang.loadingfrompropertiesfiles;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student{
@Value("${student.name}")

 
private String name;

@Value("${student.interestedCourse}")
private String intrestedCourse;

@Value("${student.hobby}")
private String hobby;
//@Value("${student.name}")
/*
public void setName(String name) {
	this.name = name;
}
@Required
//@Value("${student.interestedCourse}")
public void setIntrestedCourse(String intrestedCourse) {
	this.intrestedCourse = intrestedCourse;
}
@Required
//@Value("${student.hobby}") 
public void setHobby(String hobby) {
	this.hobby = hobby;
}
*/
public void displayStudentInfo() {
	System.out.println("student name is: " +name);
	System.out.println("student interested course: " +intrestedCourse);
	System.out.println("student hobby: " +hobby);
}

}

package com.tiang.loadingfrompropertiesfiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[]args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
	Student	 std=context.getBean("std",Student.class);
	std.displayStudentInfo();
	} 

}

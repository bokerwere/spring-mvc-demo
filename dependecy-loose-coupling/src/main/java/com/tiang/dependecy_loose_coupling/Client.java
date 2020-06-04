package com.tiang.dependecy_loose_coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {
	
	public static void main(String[]args) {
		
	ApplicationContext  context=new ClassPathXmlApplicationContext("bean.xml");
	System.out.println("loading");
	 Student sd=context.getBean("std" ,Student.class);
	  sd.startCheating();
	  
	 
}

}

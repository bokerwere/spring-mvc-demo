package com.tiang.dependecy_injection_object_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Student std=new Student();
		
		MathCheat cheat=new MathCheat();
		std.setMathCheat(cheat);
         std.cheating();
	

*/
		ApplicationContext  context=new ClassPathXmlApplicationContext("bean.xml");
		  Student sd=context.getBean("std" ,Student.class);
		  sd.cheating();
		  
		  AnotherStudent sd2=context.getBean("std1" ,AnotherStudent.class);
		  sd2.startCheating(); 
}
	 }

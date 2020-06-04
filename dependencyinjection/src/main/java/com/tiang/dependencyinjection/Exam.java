package com.tiang.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Exam 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
    	System.out.println("config loading");
    	   Student sd =context.getBean("std", Student.class);
    	   sd.display();
    	   
    	   
    	  
       	 System.out.println("config loading");
       	   Student sd1 =context.getBean("std1", Student.class);
       	   sd1.display();
  
       //Student std=new Student() ;
       //std.setStudentName("joseph were");
       //std.display();
    }
} 
    
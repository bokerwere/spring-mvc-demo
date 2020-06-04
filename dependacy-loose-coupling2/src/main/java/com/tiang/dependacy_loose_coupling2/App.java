package com.tiang.dependacy_loose_coupling2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext  context=new ClassPathXmlApplicationContext("bean.xml");
    	System.out.println( "Hello World!" );
		  Safricom sd=context.getBean("data" ,Safricom.class);
		  sd.startServices();
		  
		  //AnotherStudent sd2=context.getBean("std1" ,AnotherStudent.class);
		  //sd2.startCheating(); 
}
    	
        
    }

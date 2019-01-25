package com.spring.practice;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMain {
	
	
	public static void main(String[] args) {
		//Setters
//		HelloWorld helloWorld = new HelloWorld();
//		helloWorld.setName("Accolite");
//		helloWorld.printHello();
		
		/*System.out.println("********************************************");
		//Construcor
		HelloWorld helloWorld2 = new HelloWorld("Accolite");
		helloWorld2.printHello();*/
		
		System.out.println("Start : Using Spring:***********************");
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		HelloWorld helloWorldSpring = (HelloWorld) applicationContext.getBean("helloWorld");
//		helloWorldSpring.printHello();
	//	A a=(A) applicationContext.getBean("a");
	//	System.out.println("P:"+a.getB().getP()+" \nQ:"+a.getB().getQ()+"\nR:"+a.getB().getR());
		 //A a=(A)applicationContext.getBean("a");  
		 //   a.message();  
		
		
		JDBCTemplateDAO jdbc=applicationContext.getBean(JDBCTemplateDAO.class);
	   Attendance at=new Attendance();
	    //JDBCTemplateDAO dao=(JDBCTemplateDAO)applicationContext.getBean("edao");  
	   //List<Attendance> list=jdbc.getAllEmployeesRowMapper();
		at.setSid(542);
		at.setName("shann");
		at.setStatus("Abc");
		jdbc.saveAttendance(at);
		//jdbc.saveStudentUsingPreparedStatement(at);
	    //for(Attendance e:list)  
	    //{
	    	//System.out.println(e.getName());
	    	//System.out.println(e.getSid());
	    	//System.out.println(e.getStatus());
	    	//System.out.println(" ");
	    	//e.toaString();
	    //}
	}

}
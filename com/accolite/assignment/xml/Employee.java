package com.accolite.assignment.xml;

public class Employee {
	private int id,age;
	private String name;
	Employee(int id,String name,int age){
		  this.id=id;
		   this.name=name;
	  	   this.age=age;
	}
	 public int getId() {
		   return id;
	   }
	   public void setId(int id) {
		   this.id=id;
	   }
	   public String getName() {
	  	 return name;
	   }
	   public void setName(String name) {
	  	 this.name=name;
	   }
	   
	   public int getAge() {
	  	 return age;
	   }
	   public void setAge(int age) {
	  	 this.age=age;
}

}

package com.accolite.assignment.javacore;



public class Core {
	public static void main(String[] args) {
		Employee e= new Employee(100, "Kumar Shantanu", 21, 5000);
		System.out.println("Average Salary of Company: "+e.averageSalary());
		
		Manager m=new Manager(101,"Layeeq",23,10000,"HR");
		System.out.println("Average Salary of Company: "+m.averageSalary());
		System.out.println("Manager New Department: "+m.newDepartment("Sale"));
		
		Developer d=new Developer(6,"Deepak",29,8000,"C++","TATA");
		System.out.println("Average Salary of Company: "+d.averageSalary());
		d.addProject("Nokia");
		System.out.println("Skill Sets are: "+ d.getProject());
	}
}

 package com.accolite.assignment.javacore;

public class Employee {
   private int id;
   private String name;
   private int salary;
   private int age;
   static int employeecount=0;
   static int totalsalary=0;
   static float averagesalary;
   public Employee(int id,String name,int age,int salary)
   {
	   this.setId(id);
	   this.setName(name);
  	   this.setAge(age);
  	   this.setSalary(salary);
  	 employeecount++;
  	 totalsalary+=salary;
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
   public int getSalary() {
	  	 return salary;
	   }
   public void setSalary(int salary) {
	  	 this.salary=salary;
	   }
   public float averageSalary() {
	    averagesalary=totalsalary/employeecount;
	    return averagesalary;
	   
   }
}
 class Manager extends Employee{
	private String department;
	Manager(int id,String name,int age,int salary,String department){
		super(id,name,age,salary);
		this.setDepartment(department);
	}
	public String getDepartment() {
	  	 return department;
	   }
   public void setDepartment(String department) {
	  	 this.department=department;
	   }
   public String newDepartment(String newdepartment) {
	   department=newdepartment;
	   return department;
   }
}
 class Developer extends Employee{
	private String language;
	private String project;
	Developer(int id,String name,int age,int salary,String language,String project){
		super(id,name,age,salary);
		this.setLanguage(language);
		this.setProject(project);
	}
	public String getLanguage() {
	  	 return language;
	   }
    public void setLanguage(String language) {
	  	 this.language=language;
	   }
    public String getProject() {
	  	 return project;
	   }
   public void setProject(String project) {
	  	 this.project=project;
	   }
   public String addProject(String newproject) {
	   this.project+=newproject;
	   return project;
   }
   
}

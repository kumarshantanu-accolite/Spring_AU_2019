package com.accolite.assignment.xml;

import java.util.*;

public class Company {
	static ArrayList<Employee> employeeList=new ArrayList<>();
	public String addEmployee(int id,String name,int age) {
		employeeList.add(new Employee(id,name,age));
		return "New Employee Added";
	}
	public String displayAll(){
		String result="";
		for(Employee e:employeeList){
			System.out.println(e);
		result+="ID: "+e.getId()+" Name:"+e.getName()+" Age:"+e.getAge()+"\n";
		}
		System.out.println(result);
		return result; 
		}

		public String displayEmployeeById(int id){
		for(Employee e:employeeList){
		if(e.getId()==id)
		return " ID: "+e.getId()+" Name: "+e.getName()+" Age:"+e.getAge();
		}
		return "No Employee with this id"; 
		}

		public String updateEmployeeById(int id,String name,int age){
		for(Employee e:employeeList){
		if(e.getId()==id){
		e.setName(name);
		e.setAge(age);
		return "Employee Detail Update";
		}}
		return "No Employee with this id"; 
		}

		public String removeEmployeeById(int id){
		for(Employee e:employeeList){
		if(e.getId()==id)
		{
		employeeList.remove(e);
		return "Deleted";
		}
		
		}return "No Employee with this id"; 
		
}
}
package com.au.assignment.junit;

import java.time.LocalDate;

public class Student implements Comparable<Student>{

	public int id;
	public String name;
	public LocalDate dob;
	public int maths;
	public int science;
	public int english;
	public int total;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int compareTo(Student o) {
		if(this.total == o.total)
		{
			return this.dob.compareTo(o.dob);
		}
		else
			return o.total-this.total;
	}
}

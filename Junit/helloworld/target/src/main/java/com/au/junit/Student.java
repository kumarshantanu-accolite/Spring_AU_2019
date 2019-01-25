package com.au.junit;

import java.util.Map;

public class Student {
	public String name;
	public int rank;
	public Map<String, Integer> grades;
	
	public Student() {
		super();
	}
	
	public Student(String name, int rank, Map<String, Integer> grades) {
		super();
		this.name = name;
		this.rank = rank;
		this.grades = grades;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public Map<String, Integer> getGrades() {
		return grades;
	}
	public void setGrades(Map<String, Integer> grades) {
		this.grades = grades;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rank=" + rank + ", grades=" + grades + "]";
	}
	
	

}

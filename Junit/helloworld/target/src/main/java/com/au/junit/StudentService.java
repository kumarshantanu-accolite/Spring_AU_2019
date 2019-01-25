package com.au.junit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentService {
	public StudentDao dao;

	public StudentDao getDao() {
		return dao;
	}

	public void setDao(StudentDao dao) {
		this.dao = dao;
	}
	
	public List<Student> getTopNStudents(int n) {
		List<Student> students=dao.getStudents();
		List<Student> topers=new ArrayList<Student>();
		
		for(Student student:students) {
			if(student.getRank()<=n)
			{
				topers.add(student);
			}
		}
		return topers;
	}
	public List<Student> getListFailures(){
		List<Student> students=dao.getStudents();
		List<Student> failures = new ArrayList<Student>();
		for(Student student : students) {
			Map<String,Integer> grades = student.grades;
			for (Map.Entry<String,Integer> entry : grades.entrySet())  
	            if(entry.getValue()<=40)
	            	failures.add(student);
		}
		return failures;
	}
	}


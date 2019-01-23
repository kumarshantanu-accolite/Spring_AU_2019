package com.spring.au.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.au.dao.impl.StudentDAO;
import com.spring.au.model.Student;

@Service
public class StudentService {
	@Autowired
	StudentDAO studentDAO;
	
	public String getName() {
		return studentDAO.getName();
	}

	public void insertDetails(Student student) {
		studentDAO.insertDetails(student);
	}
	

	public List<Student> getAllEmployeesRowMapper() {
		
		return studentDAO.getAllEmployeesRowMapper();
		
	}
}
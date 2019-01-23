package com.spring.au.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.au.model.Student;
@Repository
public class StudentDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public String getName() {
		return jdbcTemplate.queryForObject("select studentname from studentdetail where studentid = 1", String.class);
	}

	public void insertDetails(Student student) {
		jdbcTemplate.update("insert into studentdetail values (" + student.getStudentId() + ", '" + student.getStudentName() + "');");
	}
	public List<Student> getAllEmployeesRowMapper()
	 { return jdbcTemplate.query("select * from studentdetail",new RowMapper<Student>(){
	 
		 
	 public Student mapRow(ResultSet rs, int rownumber) throws SQLException {
		 Student e=new Student();
	 e.setStudentId(rs.getInt(1));
	 e.setStudentName(rs.getString(2));
	  
	 return e; } }); }
	}

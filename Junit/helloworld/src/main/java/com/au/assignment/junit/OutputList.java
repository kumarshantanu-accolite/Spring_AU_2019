package com.au.assignment.junit;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import com.au.assignment.junit.Student;
import com.opencsv.CSVWriter;

public class OutputList {
	public void write(TreeSet<Student> studentList, String fileName) throws IOException {
	
	CSVWriter csvWriter = new CSVWriter(new FileWriter(new File(fileName)));

	
	List<String[]> data = toStringArray(studentList);

	csvWriter.writeAll(data);

	csvWriter.close();
	
	

}

	public List<String[]> toStringArray(TreeSet<Student> studentSet) 
	{
		
		List<String[]> records = new ArrayList<String[]>();

		records.add(new String[] { "studentCode", "studentName", "studentDOB", "studentTotalMarks" });

		for(Student student : studentSet)
			records.add(new String[] { 
					Integer.toString(student.getId()), 
					student.getName(), 
					student.getDob().toString(), 
					Integer.toString(student.getTotal()) 
					});
		return records;
	}
}

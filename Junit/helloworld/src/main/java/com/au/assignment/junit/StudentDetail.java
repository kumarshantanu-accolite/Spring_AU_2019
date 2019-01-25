package com.au.assignment.junit;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class StudentDetail {
	public TreeSet<Student> read() throws IOException{
		CSVReader reader = new CSVReader(new FileReader("StudentInfo.csv"), ',');

		CSVReader reader1 = new CSVReader(new FileReader("StudentMarks.csv"), ',');
		TreeSet<Student> student = new TreeSet<Student>();

		// read line by line
		String[] record = null;
		String[] records = null;

		while ((record = reader.readNext()) != null && (records = reader1.readNext()) != null) {
			Student std = new Student();
		    std.setId(Integer.parseInt(record[0]));
			std.setName(record[1]);
			std.setDob(LocalDate.parse(record[2]));
			std.setMaths(Integer.parseInt(records[1]));
	    	std.setScience(Integer.parseInt(records[2]));
			std.setEnglish(Integer.parseInt(records[3]));
			std.setTotal(Integer.parseInt(records[1])+Integer.parseInt(records[2])+Integer.parseInt(records[3]));
			student.add(std);
		}
		reader.close();
         reader1.close();
         return student;
	}
}

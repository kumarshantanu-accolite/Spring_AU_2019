package com.au.assignment.junit;

import java.io.IOException;
import java.util.List;
import java.util.TreeSet;

public class MainFile {
	public static void main(String[] args) throws IOException {

	final String OUTPUT = "output.csv";
	StudentDetail ma = new StudentDetail();

	
	TreeSet<Student> studentList =  (TreeSet<Student>) ma.read();

	OutputList outputList=new OutputList();	
	outputList.write(studentList, OUTPUT);
}

}

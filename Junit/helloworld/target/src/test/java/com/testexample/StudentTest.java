package com.testexample;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.List;
import java.util.TreeSet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import com.au.assignment.junit.MainFile;
import com.au.assignment.junit.OutputList;
import com.au.assignment.junit.Student;



public class StudentTest {
	@BeforeClass
	public static void beforeclass() { 
		System.out.println("Starting Junit");
	}
	@Test
	public void testConverterWithMockito()
	{
		Student student1 = new Student(42,"Vivia Kielty", LocalDate.parse("1993-02-28"), 95,64,63,222);
		
		TreeSet<Student> studentSet = new TreeSet<Student>();
		studentSet.add(student1);
		
		OutputList a1 = new OutputList();
		OutputList a2 = Mockito.spy(a1);
		
		Mockito.when(a2.toStringArray(studentSet)).thenReturn(a1.toStringArray(studentSet));
		List<String[]> stringList = a2.toStringArray(studentSet);
		
		assertEquals(4, stringList.get(1).length);
		assertEquals("studentCode", stringList.get(0)[0]);
	}
	@Before
	public void testmain() {
		MainFile a=new MainFile();
		System.out.println("Begin Main File");
	}
	@After
	public void testoutput() {
		OutputList a=new OutputList();
		System.out.println("After");
	}
	@AfterClass
	public static void afterclass() {
		System.out.println("Ending the Junit");
	}

}

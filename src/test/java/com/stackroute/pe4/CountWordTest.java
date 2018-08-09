package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CountWordTest {
	public static CountWord obj;
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		
		obj=new CountWord();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		obj= null;

	}
	@Test
	public void testcount1() {
		String res="Java is java again java again";
		char a='a';
		assertEquals(10,obj.count(res,a));
	}
	@Test
	public void testcount2() {
		String res="abcdefghij";
		char a='m';
		assertEquals(0,obj.count(res,a));
	}
	@Test
	public void testcount3() {
		String res="hello world";
		char a='o';
		assertNotEquals(10,obj.count(res,a));
	}

}

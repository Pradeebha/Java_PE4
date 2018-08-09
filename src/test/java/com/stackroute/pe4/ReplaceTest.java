package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ReplaceTest {
	public static Replace obj;
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		
		obj=new Replace();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		obj= null;

	}
	@Test
	public void test1() {
		String res="daily dry";
		assertEquals("faity fry",obj.replace(res));
	}
	@Test
	public void test2() {
		String res="today";
		assertNotEquals("today",obj.replace(res));
	}
	@Test
	public void test3() {
		String res="ldddl";
		assertEquals("tffft",obj.replace(res));
	}

}

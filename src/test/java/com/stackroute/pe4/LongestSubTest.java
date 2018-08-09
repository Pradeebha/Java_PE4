package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;



public class LongestSubTest {
	public static LongestSub l;
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		
		l=new LongestSub();
	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		l = null;

	}
	@Test
	public void test1() {
		String res=l.findsub("aabbccabababaaaabababacbabccbcbcb");
		assertEquals("abababaaaabababa",res);
	}
	@Test
	public void test2() {
		String res=l.findsub("abababccbabcbcbcbcbc");
		assertEquals("bcbcbcbcbc",res);
	}
	@Test
	public void test3() {
		String res=l.findsub("ababccbbdd");
		assertEquals("abab",res);
	}
}

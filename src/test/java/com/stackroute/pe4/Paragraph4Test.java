package com.stackroute.pe4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Paragraph4Test {
	private static Paragraph4 trip;
	
	
	@BeforeClass
	public static void setup() {
		
		trip = new Paragraph4();

	}

	@AfterClass
	public static void teardown() {
		trip=null;
	}
	
	@Test
	public void toGetTans() {
		String s="nameistrue";
		String s1="aeeimnrstu";
		assertEquals(s1,trip.getTrans(s));
	}
	
	@Test
	public void toGetAgain() {
		String s1="abcdefgh";
		String s2="acedsfsd";
		String res=trip.getTrans(s2);
		assertNotEquals(s1,res);
	}
	
}


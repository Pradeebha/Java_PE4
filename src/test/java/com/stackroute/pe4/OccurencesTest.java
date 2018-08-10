package com.stackroute.pe4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class OccurencesTest {

	private static Occurences opt;
	
	@BeforeClass
	public static void setup() {
		
		opt = new Occurences();

	}

	@AfterClass
	public static void teardown() {
		opt = null;
	}
	
	@Test
	public void toGetTans() {
		String s="She sells seashells by the seashore";
		String s2="se";
		String s1="Found at: 4 - 6Found at: 10 - 12Found at: 27 - 29";
		assertEquals(s1,opt.getOccur(s,s2));
	}
	
	@Test
	public void toGetAgain() {
		String s="abababcd";
		String s2="ab";
		String s1="Found at:0 -5";
		String res=opt.getOccur(s,s2);
		assertNotEquals(s1,res);
	}
	
}
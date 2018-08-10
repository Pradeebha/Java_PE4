package com.stackroute.pe4;

import java.util.Arrays;

public class Paragraph4 {

		public String getTrans(String s) {
			 char tempArray[] = s.toCharArray();
		        Arrays.sort(tempArray);
		        return new String(tempArray);
	}
}

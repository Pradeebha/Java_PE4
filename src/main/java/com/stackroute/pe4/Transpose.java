package com.stackroute.pe4;

public class Transpose{

	public String toTrans(String str) {
		String[] words = str.split(" ");
	    String reverse = "";
	    for (int i = 0; i < words.length; i++)
	       {
	          String word = words[i];
	          String reverseWord = "";
	          for (int j = word.length()-1; j >= 0; j--) 
	       {
	        reverseWord = reverseWord + word.charAt(j);
	       }
	       reverse = reverse + reverseWord + " ";
	    }
	   
		
			 
			
		// TODO Auto-generated method stub
		return reverse.trim();
	}
	
}
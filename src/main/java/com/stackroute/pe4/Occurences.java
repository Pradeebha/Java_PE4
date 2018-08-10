package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Occurences {

	public String getOccur(String s1,String s2) {
		
		
		Pattern pattern = Pattern.compile(s2);
        Matcher matcher = pattern.matcher(s1);
        String res="";

       
        while(matcher.find()) {
            
            res=res+"Found at:" +" "
                    + matcher.start() + " - " + matcher.end();
        }
		return res;
	}

}
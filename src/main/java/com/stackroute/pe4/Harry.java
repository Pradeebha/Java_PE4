package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Harry {


	public boolean tocheckWizard(String s, String s4) {
		boolean res;
		Pattern p = Pattern.compile(s4);   
	    Matcher m = p.matcher(s);
		if(m.find())
			res=true;
		else
			res=false;
		return res;
	}

}
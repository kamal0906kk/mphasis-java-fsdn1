package com.AssistedProject;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String pattern ="[789]{1}[0-9]{9}";
	       Pattern p=Pattern.compile(pattern);
	       Matcher match=p.matcher("9021839381");
	       if(match.matches()) {
	    	   System.out.println("yes successfully matches");
	       }
	       else {
	       
	          System.out.println("no it is not match");
		}
	}

}



package com.techm.sush;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {
	
	public static void main(String[] args) {
		String s1="apple, apple and orangle please";
		String s2=s1.replaceAll("ple","ricot");
		String s3=s1.replaceAll("ple\\b","ricot");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//split method
		String [] strArr=s1.split("\\b");
		for(String s:strArr){
			if(s.matches("\\w+"))// finding only words
			System.out.print(s);
			
		}
		System.out.println();
		//Patten and matcher in dedicated regulat expression
		String s4="apple, apple and orangle please";
		Pattern pattern=Pattern.compile("\\w+");
		Matcher matcher=pattern.matcher(s4);
		while(matcher.find()){
			System.out.print(matcher.group());
		}
	}

}

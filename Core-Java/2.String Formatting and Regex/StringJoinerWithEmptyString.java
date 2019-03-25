package com.techm.sush;

import java.util.StringJoiner;

public class StringJoinerWithEmptyString {

	public static void main(String[] args) {
		//In this Nothing is printed as empty
		StringJoiner sj=new StringJoiner(",");
		String str=sj.toString();
		System.out.println(str);
		
		//in this {} are printed as start and end of empty
		StringJoiner sj1=new StringJoiner(",","{","}");
		String str1=sj1.toString();
		System.out.println(str1);
		
		//in this EMPTY are printed 
		StringJoiner sj2=new StringJoiner(",");
		sj2.setEmptyValue("EMPTY");
		String str2=sj2.toString();
		System.out.println(str2);
		
		//in this only EMPTY are printed even thogh start and end with{}
		StringJoiner sj3=new StringJoiner(",","{","}");
		sj3.setEmptyValue("EMPTY");
		String str3=sj3.toString();
		System.out.println(str3);	
		
		//in this nothing printed As we use add('') it act as data with empty
		StringJoiner sj4=new StringJoiner(",");
		sj4.setEmptyValue("EMPTY");
		sj4.add("");
		String str4=sj4.toString();
		System.out.println(str4);
		
		//in this {} are printed As we use add('') it act as data with empty
		StringJoiner sj5=new StringJoiner(",","{","}");
		sj5.setEmptyValue("EMPTY");
		sj5.add("");
		String str5=sj5.toString();
		System.out.println(str5);	
	}

}

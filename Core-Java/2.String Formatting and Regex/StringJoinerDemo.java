package com.techm.sush;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		//example for seperation of elements by comma
		StringJoiner sj=new StringJoiner(", ");
		sj.add("Sushil");
		sj.add("Suchita");
		sj.add("Sagar");
		sj.add("Kiran");
		sj.add("Shweta");
		String str=sj.toString();
		System.out.println(str);
		
		//example for seperation of elements by square bracket and comma
				StringJoiner sj1=new StringJoiner("], [","[","]");
				sj1.add("Sushil");
				sj1.add("Suchita");
				sj1.add("Sagar");
				sj1.add("Kiran");
				sj1.add("Shweta");
				String str1=sj1.toString();
				System.out.println(str1);
				
		//example for seperation of elements by comma & open-closed by {}
				StringJoiner sj2=new StringJoiner(",","{","}");
				sj2.add("Sushil");
				sj2.add("Suchita");
				sj2.add("Sagar");
				sj2.add("Kiran");
				sj2.add("Shweta");
				String str2=sj2.toString();
				System.out.println(str2);

	}

}

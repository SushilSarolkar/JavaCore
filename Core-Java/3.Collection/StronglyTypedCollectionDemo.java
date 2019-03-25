package com.techm.sushil;

import java.util.ArrayList;

public class StronglyTypedCollectionDemo {

	public static void main(String[] args) {
		//here inside<> this is a String so this is called as generics.
		ArrayList<String> list=new ArrayList<>();
		list.add("Sushil");
		list.add("sagar");
		list.add("Suchita");
		System.out.println("elemnet size="+list.size());
		for(String s:list){
			System.out.println(s);
		}
		//getting sngle object by index.
		String s=list.get(0);
		System.out.println(s);
		

	}

}

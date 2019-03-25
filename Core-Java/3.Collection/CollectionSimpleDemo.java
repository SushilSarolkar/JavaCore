package com.techm.sushil;

import java.util.ArrayList;

public class CollectionSimpleDemo {
	public static void main(String[] args) {
	ArrayList list=new ArrayList();
	list.add("sushil");
	list.add("Suchita");
	list.add("shweta");
	list.add("sagar");
	System.out.println("size of list is "+list.size());
	for(Object o:list){
		System.out.println(o.toString());
	}
	//getting single value by get method
	String s=(String)list.get(0);
	System.out.println(s);
	}

}

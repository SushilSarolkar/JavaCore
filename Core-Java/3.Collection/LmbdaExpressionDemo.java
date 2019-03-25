package com.techm.sushil;

import java.util.ArrayList;

public class LmbdaExpressionDemo {

	public static void main(String[] args) {
		ArrayList<Myclass>al=new ArrayList<>();
		Myclass m1=new Myclass("v1", "abc");
		Myclass m2=new Myclass("v2", "xyz");
		Myclass m3=new Myclass("v3", "abc");
		al.add(m1);
		al.add(m2);
		al.add(m3);
		//Lambda expression using forEach method and ->(Arrow).
		System.out.println("print using Lambda expression by ForEach method: ");
		al.forEach(m ->System.out.println(m.getLabel()));
		
		//Lambda expression using forEach method and ->(Arrow) with REMOVEIF method.
		al.removeIf(m ->m.getValue().equals("abc"));
		System.out.println("print using Lambda expression by ForEach and removeIF method: ");
		al.forEach(m ->System.out.println(m.getLabel()));
	}

}

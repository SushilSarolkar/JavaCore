package com.techm.sushil;

import java.util.ArrayList;

public class Collection2ArrayConversionDemo {

	public static void main(String[] args) {
		Myclass m1=new Myclass("s1", "abc");
		Myclass m2=new Myclass("s2", "xyz");
		Myclass m3=new Myclass("s3", "abc");
		ArrayList<Myclass>list=new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		Object[]objArr=list.toArray();
		for(Object o:objArr){
			System.out.println(o);
		}
		Myclass[] a1=list.toArray(new Myclass[0]);
		Myclass[] a2=new Myclass[3];
		Myclass[] a3=list.toArray(a2);
		System.out.println(a1[0]);
		System.out.println(a2[2]);
		System.out.println(a3[1]);
		if(a2==a3){
			System.out.println("equals a2 and a3");
		}
		
	}

}

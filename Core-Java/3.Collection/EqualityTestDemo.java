package com.techm.sushil;

import java.util.ArrayList;

public class EqualityTestDemo {

	public static void main(String[] args) {
		Myclass myclass=new Myclass("s1", "Sushil");
		Myclass myclass1=new Myclass("s2", "Sushil");
		Myclass myclass2=new Myclass("s3", "Sushil");
		//here comparing values with .equals method which compare values only not reference
		boolean res=myclass.equals(myclass1);
		boolean res1=myclass1.equals(myclass2);
		boolean res2=myclass.equals(myclass2);
		System.out.println(res);
		System.out.println(res);
		System.out.println(res);
		
		ArrayList<Myclass> al=new ArrayList<>();
		al.add(myclass);
		al.add(myclass1);
		al.add(myclass2);
		for(Myclass m:al){
			System.out.println(m);
		}
		al.remove(myclass2);
		System.out.println("it removed object 1 as s1--Sushil bt it should removed s3 ");
		for(Myclass m:al){
			System.out.println(m.getLabel());
		}
	}

}

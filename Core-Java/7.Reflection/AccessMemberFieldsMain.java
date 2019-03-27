package com.techm.sushil;

import java.lang.reflect.Field;

public class AccessMemberFieldsMain {

	public static void main(String[] args) {
		BankAccount b1=new BankAccount("0001");
		HighVolumeAccount h1=new HighVolumeAccount("0002");
		fieldInfo(b1);
		fieldInfo(h1);
		

	}
	static void fieldInfo(Object o){
		Class<?> c=o.getClass();
		Field [] fields=c.getFields();
		Field [] fields1=c.getDeclaredFields();
		displayFields(fields);
		displayFields(fields1);
	}
	static void displayFields(Field [] arr){
		for(Field f:arr){
			System.out.println(f.getName()+"--"+f.getType());
		}
	}

}

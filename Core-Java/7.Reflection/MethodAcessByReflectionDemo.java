package com.techm.sushil;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodAcessByReflectionDemo {

	public static void main(String[] args) {
		BankAccount b1=new BankAccount("0001");
		callGetId(b1);
		BankAccount b2=new BankAccount("0002", 500);
		callgetDeposite(b2,500);
		System.out.println(b2.getBalance());
	}
	static void callGetId(Object o){
		try {
		Class<?> c=o.getClass();
		Method m=c.getMethod("getId");
		Object result=m.invoke(o);
		System.out.println(result);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	static void callgetDeposite(Object o,int ammount){
	try {
		Class<?>c=o.getClass();
		Method m=c.getDeclaredMethod("deposite",int.class);
		m.invoke(o, ammount);
	} catch (Exception e) {
		System.out.println(e.getClass()+"--"+e.getMessage()
		);
	} 
	}

}

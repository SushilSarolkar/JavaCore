package com.techm.sushil;

import java.lang.reflect.Method;

public class AccessingMethodMain {

	public static void main(String[] args) {
		BankAccount b1=new BankAccount("0001");
		HighVolumeAccount h1=new HighVolumeAccount("0002");
		methodInfo(b1);
		methodInfo(h1);

	}
	static void methodInfo(Object o){
		Class<?>c=o.getClass();
		Method[] methods=c.getMethods();
		for(Method m:methods){
			//if we dont want object class method the we need to remove comment of the following line.
			/*if(m.getDeclaringClass()!=Object.class){*/
			System.out.println(m.getName()+"--"+m.getReturnType()+"--"+m.getTypeParameters());
			/*}*/
		}
		Method[] declaredmethods=c.getDeclaredMethods();
		for(Method m:declaredmethods){
			System.out.println(m.getName()+"--"+m.getReturnType()+"--"+m.getTypeParameters());
		}
	}

}

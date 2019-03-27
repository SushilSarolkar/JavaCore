package com.techm.sushil;

import java.lang.reflect.Modifier;

public class AccessClassInterfaceMain {

	public static void main(String[] args) {
	BankAccount b1=new BankAccount("0001");
	HighVolumeAccount h1=new HighVolumeAccount("0002");
	classInfo(b1);
	classInfo(h1);
	typeModifires(b1);
	typeModifires(h1);

	}
	//geting class and interface information
    static void classInfo(Object o){
    	Class<?> c=o.getClass();
    	System.out.println(c.getSimpleName());
    	Class<?> superClass=c.getSuperclass();
    	System.out.println(superClass.getSimpleName());
    	//Accessing all interfaces implemented by the class.
    	Class<?>[] interfaces=c.getInterfaces();
    	for(Class<?> intr:interfaces){
    		System.out.println(intr.getSimpleName());
    	}
    }
    
    //getting information about access modifiers
    static void typeModifires(Object obj){
    	Class<?> c=obj.getClass();
    	int modifiers=c.getModifiers();
    	if((modifiers & Modifier.FINAL) > 0){
    		System.out.println("Bitwise check- final");
    	}
    	if(Modifier.isFinal(modifiers)){
    		System.out.println("Bitwise check- final");
    	}
    	if(Modifier.isPrivate(modifiers)){
    		System.out.println("Bitwise check- Private");
    	}
    	if(Modifier.isProtected(modifiers)){
    		System.out.println("Bitwise check- Protected");
    	}
    	if(Modifier.isPublic(modifiers)){
    		System.out.println("Bitwise check- Public");
    	}
    	
    	
    }
}

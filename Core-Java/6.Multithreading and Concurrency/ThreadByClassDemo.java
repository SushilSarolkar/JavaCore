package com.techm.sushil;

public class ThreadByClassDemo extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("int: "+i);
		}
	}
	public static void main(String[] args) {
		Thread t= new ThreadByClassDemo();
		t.start();
		System.out.println("hello hi");
		for(int i=0;i<10;i++){
			System.out.println("main: "+i);
		}
		//geting the name of the thread
		System.out.println(t.currentThread().getName());

		//setting name to the thread
		t.currentThread().setName("myGiven name");
		System.out.println(t.currentThread().getName());
		System.out.println(t.currentThread().getPriority());
	}

}

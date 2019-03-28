package com.techm.sushil;

public class RunnableLambda {

	public static void main(String[] args)throws InterruptedException {
		/*Runnable runnable= new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<3;i++){
					System.out.println("hellow world from "
							+ "thread{"+Thread.currentThread().getName()+"}");
				}
			}
		};*/
		
		//Using lambda expression
		Runnable runnableLambda=() -> {
			for(int i=0;i<3;i++){
				System.out.println("hellow world from "
						+ "thread{"+Thread.currentThread().getName()+"}");
			}
		};
		
		Thread t= new Thread(runnableLambda);
		t.start();
		t.join();
	}

}

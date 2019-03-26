package com.techm.sushil;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BankingMain {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(5);
		BankAccount account=new BankAccount(100);
		//check different result by removing this for and with this for loop
		for(int i=0;i<5;i++){
		Worker worker=new Worker(account);
		es.submit(worker);
		}
		es.shutdown();
		try {
			es.awaitTermination(60,TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

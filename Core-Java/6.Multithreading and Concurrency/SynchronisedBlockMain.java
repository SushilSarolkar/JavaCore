package com.techm.sushil;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronisedBlockMain {
	public static void main(String[] args) {
		BankAccount b1=new BankAccount(1000);
		TxPromoWorker txWorker=new TxPromoWorker(b1, 'w', 1000);
		BankAccount b2=new BankAccount(1000);
		TxPromoWorker txWorker2=new TxPromoWorker(b2, 'w', 1000);
		BankAccount b3=new BankAccount(1000);
		TxPromoWorker txWorker3=new TxPromoWorker(b2, 'w', 1000);
		BankAccount b4=new BankAccount(1000);
		TxPromoWorker txWorker4=new TxPromoWorker(b2, 'w', 1000);
		BankAccount b5=new BankAccount(1000);
		TxPromoWorker txWorker5=new TxPromoWorker(b2, 'w', 1000);
		ExecutorService es=Executors.newFixedThreadPool(5);
		
		TxPromoWorker [] txWorkers={ txWorker, txWorker2, txWorker3, txWorker4 };
		for(TxPromoWorker tx:txWorkers){
			es.submit(tx);
		}
		es.shutdown();
			
	}
	
}

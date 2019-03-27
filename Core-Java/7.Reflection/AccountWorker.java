package com.techm.sushil;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AccountWorker implements Runnable{
	BankAccount ba;
	HighVolumeAccount hva;
	
	public AccountWorker(BankAccount ba) {
		super();
		this.ba = ba;
	}
	public AccountWorker(HighVolumeAccount hva) {
		super();
		this.hva = hva;
	}

	public void doWork(){
		Thread t=new Thread(hva!=null?hva:this);
		t.start();
	}
	@Override
	public void run() {
		char txType='d';
		int amt=1000;
		if(txType=='d'){
			ba.deposite(amt);
			}
		else{
			ba.Withdraw(amt);
		}
	}
	public static void main(String[] args) {
		BankAccount b1= new BankAccount("01", 50000);
		strtwork("com.techm.sushil.AccountWorker",b1);
		b1.getBalance();
		

	}
	static void strtwork(String workerTypeName,Object workerTarget){
		try {
			Class<?>workerType=Class.forName(workerTypeName);
			Class<?> targetType=workerTarget.getClass();
			Constructor c=workerType.getConstructor(targetType);
			Object worker=c.newInstance(workerTarget);
			Method doWork=workerType.getMethod("doWork");
			doWork.invoke(worker);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}

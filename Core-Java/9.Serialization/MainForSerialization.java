package com.techm.sushil;

public class MainForSerialization {
	
	public static void main(String [] args){
		BankAccount ba=new BankAccount("01", 1000);
		System.out.println(ba.getBalance());
		ba.deposite(200);
		System.out.println(ba.getBalance());
		ba.saveAccount(ba, "account.dat");
		ba.loadAccount("account.dat");
	}
}

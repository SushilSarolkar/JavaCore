package com.techm.sushil;

public class TxWorker implements Runnable{
	protected BankAccount account;
	protected char txType;
	protected int amt;
	public TxWorker(BankAccount acoount, char txType, int amt) {
		super();
		this.account = acoount;
		this.txType = txType;
		this.amt = amt;
	}
	public void run() {
		if(txType=='w')
		account.Withdraw(amt);	
		else if(txType=='d')
			account.deposit(amt);		
		
		
	}
	

}

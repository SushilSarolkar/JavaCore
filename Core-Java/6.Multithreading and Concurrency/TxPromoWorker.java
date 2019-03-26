package com.techm.sushil;

public class TxPromoWorker extends TxWorker{

	public TxPromoWorker(BankAccount acoount, char txType, int amt) {
		super(acoount, txType, amt);
		
	}
	public void run(){
		if(txType=='w')
		  account.Withdraw(amt);	
		else if(txType=='d'){
		  account.deposit(amt);	
		  synchronized (account) {
			  if(account.getBalance() > 500){
			  int bonus=((account.getBalance() - 500) * 01);
			  account.deposit(bonus);
			  System.out.println("balance: "+account.getBalance());
		  }
		}
		}
	}

}

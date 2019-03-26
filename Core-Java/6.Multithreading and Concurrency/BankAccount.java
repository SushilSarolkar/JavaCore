package com.techm.sushil;

public class BankAccount {
	private int balance;

	public BankAccount(int balance) {
		super();
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public synchronized void setBalance(int balance) {
		this.balance = balance;
	}
	public synchronized void deposit(int amount){
		balance+=amount;
	}
	public synchronized void Withdraw(int amount){
		balance-=amount;
	}

}

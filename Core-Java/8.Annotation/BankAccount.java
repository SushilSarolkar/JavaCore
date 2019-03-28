package com.techm.sushil;
public class BankAccount {

	private final String Id;
	private int balance;

	public BankAccount(String id) {
		super();
		Id = id;
	}

	public BankAccount(String id, int balance) {
		super();
		Id = id;
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public String getId() {
		return Id;
	}
	public synchronized void deposite(int ammount){
		balance+=ammount;
	}
	public synchronized void Withdraw(int ammount){
		balance-=ammount;	
	}
	static void showName(Class<?> c){
		System.out.println(c.getSimpleName());
	}
	static void doWork(Object o){
	Class<?> c=o.getClass();
	showName(c);
   }

	public static void main(String[] args) {
		BankAccount b1=new BankAccount("0001");
		BankAccount b2= new BankAccount("0002", 10000);
		b1.deposite(1500);
		b1.Withdraw(1000);
		System.out.println(b1.getBalance());
		b2.deposite(1500);
		b2.Withdraw(1000);
		System.out.println(b2.getBalance());
		//getting name of class by Type reference 
		doWork(b1);
		//by String name or type literal
		try {
			Class<?> c=Class.forName("com.techm.sushil.BankAccount");
			showName(c);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getClass()+"-"+e.getMessage());
		}
		//by literal
		Class<?> c=BankAccount.class;
		showName(c);
		//by without <?> uses known type
		Class<BankAccount> bnk=BankAccount.class;
		showName(bnk); 
		}

}

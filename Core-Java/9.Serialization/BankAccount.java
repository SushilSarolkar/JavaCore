package com.techm.sushil;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BankAccount implements Serializable {

	private String Id;
	private int balance;
	private char lastTxType;
	private int lastTxAmmount;

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
		lastTxType='d';
		lastTxAmmount=ammount;
	}
	public synchronized void Withdraw(int ammount){
		balance-=ammount;	
		lastTxType='w';
		lastTxAmmount=ammount;
	}
	
	public void saveAccount(BankAccount ba, String fileName){
		try(
				ObjectOutputStream outputStream=
				new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))){
				outputStream.writeObject(ba);
				}catch(IOException e){
					System.out.println(e.getClass()+""+e.getMessage());
				}
		
	}
	
	public BankAccount loadAccount(String fileName){
		        BankAccount ba=null;
		 try(	
				ObjectInputStream inputStream=
				new ObjectInputStream(Files.newInputStream(Paths.get(fileName)))){
			 	ba=(BankAccount)inputStream.readObject();	
		 		}catch(IOException e){
		 			System.out.println(e.getClass()+"-"+e.getMessage());
		 		}catch(ClassNotFoundException e1){
		 			System.out.println(e1.getClass()+"-"+e1.getMessage());
		 		}
		 			return ba;
			}
	
	private void writeObject(ObjectOutputStream out)throws IOException{
		out.defaultWriteObject();
		
	}
	private void readObject(ObjectInputStream in)throws IOException,ClassNotFoundException{
		ObjectInputStream.GetField fields=in.readFields();
		Id=(String)fields.get("Id", null);
		balance=fields.get("balance", 0);
		fields.get("lastTxType", 'u');
		fields.get("lastTxAmmount", -1);
		in.defaultReadObject();
	}
}

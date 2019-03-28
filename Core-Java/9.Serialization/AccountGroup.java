package com.techm.sushil;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class AccountGroup implements Serializable {
	private Map<String,BankAccount> map=new HashMap<>();
	private transient int totalBalance;
	public int getTotalBalance() {
		return totalBalance;
	}
	public void setTotalBalance(int totalBalance) {
		this.totalBalance = totalBalance;
	}
	public void addAccount(BankAccount ba){
		totalBalance+=ba.getBalance();
		map.put(ba.getId(), ba);
	}
	public static void main(String[] args) {
		BankAccount ba1=new BankAccount("001", 500);
		BankAccount ba2=new BankAccount("002", 750);
		AccountGroup accountGroup=new AccountGroup();
		accountGroup.addAccount(ba1);
		accountGroup.addAccount(ba2);
		SaveGroup(accountGroup,"group.dat");
		System.out.println(loadGroup("group.dat"));
		ba1.getBalance();
		ba2.getBalance();
	}
	static void SaveGroup(AccountGroup g, String fileName) {
		try(
				ObjectOutputStream outputStream=
				new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))){
				outputStream.writeObject(g);
				}catch(IOException e){
					System.out.println(e.getClass()+""+e.getMessage());
				}
	

			}
	static AccountGroup loadGroup(String fileName){
		AccountGroup g=null;
		 try(	
					ObjectInputStream inputStream1=
					new ObjectInputStream(Files.newInputStream(Paths.get(fileName)))){
				 	g=(AccountGroup)inputStream1.readObject();	
			 		}catch(IOException e){
			 			System.out.println(e.getClass()+"-"+e.getMessage());
			 		}catch(ClassNotFoundException e1){
			 			System.out.println(e1.getClass()+"-"+e1.getMessage());
			 		}
			 			return g;		
			 	}
	void readObject(ObjectInputStream in)throws IOException,ClassNotFoundException{
		in.defaultReadObject();
		for(BankAccount account:map.values()){
			totalBalance+=account.getBalance();
		}
	}
	
   }

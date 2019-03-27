package com.techm.sushil;

public final class HighVolumeAccount extends BankAccount implements Runnable{

	public HighVolumeAccount(String id) {
		super(id);
	}
	public HighVolumeAccount(String id,int balance) {
		super(id,balance);
	}
	private int[] readDailyDeposite(){
		 int[] abc={10,20,30};
		 return abc;
		
	}
	private int[] readDailyWithdrawal(){
		 int[] abc={40,50,60};
		 return abc;
		
	}
	@Override
	public void run() {
		for(int dailyamt:readDailyDeposite()){
			deposite(dailyamt);
		}
		for(int dailyamt1:readDailyWithdrawal()){
			deposite(dailyamt1);
		}
		
	}
	
}

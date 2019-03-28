package com.techm.sushil;

@WorkHandler(useThreadPool = false)
public class AccountWorker implements Runnable, TaskWorker {
	BankAccount ba;

	public AccountWorker(BankAccount ba) {
		super();
		this.ba = ba;
	}

	public void doWork() {
		Thread t = new Thread(HighVolumeAccount.class.isInstance(ba) ? (HighVolumeAccount) ba : this);
		t.start();
	}

	@Override
	public void run() {
		char txType = 'd';
		int amt = 1000;
		if (txType == 'd') {
			ba.deposite(amt);
		} else {
			ba.Withdraw(amt);
		}
	}

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("01", 50000);
		startwork("com.techm.sushil.AccountWorker", b1);
		b1.getBalance();

	}

	static void startwork(String workerTypeName, Object workerTarget) {
		try {
			Class<?> workerType = Class.forName(workerTypeName);
			TaskWorker worker = (TaskWorker) workerType.newInstance();
			worker.setTarget(workerTarget);
			WorkHandler wh = workerType.getAnnotation(WorkHandler.class);
			if (wh.useThreadPool()) {
				pool.submit(new Runnable() {
					public void run() {
						worker.doWork();
					}
				});
			}else
				worker.doWork();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void setTarget(Object target) {

	}

}

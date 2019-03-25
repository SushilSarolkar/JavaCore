package com.techm.sushil;

public class ExecutionEnvironmentDemo {

	public static void main(String[] args) {
		String computerName=System.getenv("computerName");
		String sysRoot=System.getenv("systemRoot");
		System.out.println(computerName);
		System.out.println(sysRoot);

	}

}

package com.techm.sushil;
@SuppressWarnings("deprecation")
public class MyWorker {
	
	void doSomeWork(){
		Doer doer=new Doer();
		doer.doItThisWay();
	}
	
	void doDoubleWork(){
		Doer doer1=new Doer();
		Doer doer2=new Doer();
		doer1.doItThisWay();
		doer2.doItThisWay();
	}
	

}

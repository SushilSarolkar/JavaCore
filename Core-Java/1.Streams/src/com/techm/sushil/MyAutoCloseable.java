package com.techm.sushil;

import java.io.IOException;

public class MyAutoCloseable implements AutoCloseable {
	
	public void saySomething() throws IOException{
		System.out.println("Somthing");
	}
	public void close()throws IOException{
		System.out.println("close");
	}
	
	

}

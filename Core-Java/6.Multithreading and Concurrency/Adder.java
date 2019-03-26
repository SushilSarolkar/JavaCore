package com.techm.sushil;

import java.io.IOException;

public class Adder implements Runnable {
	private String inFile;
	private String outFile;
	public Adder(String inFile, String outFile) {
		super();
		this.inFile = inFile;
		this.outFile = outFile;
	}
	@Override
	public void run() {
		try {
			doAdd();
		} catch (IOException e) {
			System.out.println(e.getClass() + ": " + e.getMessage());
		}
	}
	public static void main(String[] args) {
		String[] inputFile = { "./one.txt", "./two.txt", "/.three.txt", "./four.txt" };
		String[] outputFile = { "./one1.txt", "./two2.txt", "/.three3.txt", "./four4.txt" };
		Thread[] thrd = new Thread[inputFile.length];
		try {
			for (int i = 0; i < inputFile.length; i++) {
				Adder adder = new Adder(inputFile[i], outputFile[i]);
				/* Thread thread=new Thread(adder); */
				thrd[i] = new Thread(adder);
				thrd[i].start();
			}
			for (Thread threads : thrd) {
				threads.join();
			}
		} catch (Exception e) {
			System.out.println(e.getClass() + ": " + e.getMessage());
		}
	}
	public void doAdd() throws IOException {
		System.out.println("hii");
	}
}

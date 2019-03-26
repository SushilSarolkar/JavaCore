package com.techm.sushil;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AdderThreadPoolDemo implements Runnable {
	private String inFile;
	private String outFile;
	public AdderThreadPoolDemo(String inFile, String outFile) {
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
		/*Thread[] thrd = new Thread[inputFile.length];*/
		ExecutorService es=Executors.newFixedThreadPool(3);
		try {
			for (int i = 0; i < inputFile.length; i++) {
				AdderThreadPoolDemo adder = new AdderThreadPoolDemo(inputFile[i], outputFile[i]);
				/* Thread thread=new Thread(adder); */
				/*thrd[i] = new Thread(adder);
				thrd[i].start();*/
				es.submit(adder);
				es.shutdown();
				es.awaitTermination(60,TimeUnit.SECONDS);
			}
			/*for (Thread threads : thrd) {
				threads.join();
			}*/
		} catch (Exception e) {
			System.out.println(e.getClass() + ": " + e.getMessage());
		}
	}
	public void doAdd() throws IOException {
		System.out.println("hii");
	}

}

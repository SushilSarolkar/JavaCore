package com.techm.sushil;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class AdderCallableDemo implements Callable<Integer>{

	private String inFile;
	public AdderCallableDemo(String inFile) {
		super();
		this.inFile = inFile;
	}
	public static void main(String[] args) {
		String[] inputFile = { "./one.txt", "./two.txt", "/.three.txt", "./four.txt" };
		ExecutorService es=Executors.newFixedThreadPool(3);
	    Future<Integer> [] result=new Future[inputFile.length];
		try {
			for (int i = 0; i < inputFile.length; i++) {
				AdderCallableDemo adder = new AdderCallableDemo(inputFile[i]);
				result[i]=es.submit(adder);
				es.shutdown();
				es.awaitTermination(60,TimeUnit.SECONDS);
			}
			try {
				for(Future<Integer> res:result){
					int value=res.get();
					System.out.println(value);
				}
			} catch (ExecutionException e) {
				Throwable adderEx=e.getCause();
			}catch (Exception e) {
				System.out.println(e.getClass() + ": " + e.getMessage());
			}
			
		} catch (Exception e) {
			System.out.println(e.getClass() + ": " + e.getMessage());
		}
	}
	public int doAdd() throws IOException {
		int total=0;
		String line=null;
		try(BufferedReader bufferedReader=Files.newBufferedReader(Paths.get(inFile))){
			while((line=bufferedReader.readLine())!=null){
				total+=Integer.parseInt(line);
			}
			return total;
		}
	}
	@Override
	public Integer call() throws Exception {
		return doAdd();
	}
}

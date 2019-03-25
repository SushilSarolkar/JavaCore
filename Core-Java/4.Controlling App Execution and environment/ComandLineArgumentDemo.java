package com.techm.sushil;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ComandLineArgumentDemo {

	public static void main(String[] args) {
		if(args.length==0){
			showMessage();
			return;
		}
		String filename=args[0];
		if(!Files.exists(Paths.get(filename))){
			System.out.println();
		}
		showFileLines(filename);
	}
	private static void showFileLines(String filename){
		System.out.println();
		try(BufferedReader reader=Files.newBufferedReader(Paths.get(filename))){
			String line=null;
			while((line=reader.readLine()) !=null){
				System.out.println(line);
			}
		    }catch(Exception e){
			System.out.println(e.getClass()+""+e.getMessage());
		}
	}
	
	private static void showMessage(){
		System.out.println();
		System.out.println("please rovide the filename to process the command line orgument");
	}

}

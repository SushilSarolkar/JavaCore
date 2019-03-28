package com.techm.sushil;

import java.io.File;
import java.io.FileFilter;

public class FirstLambdaExpression {
	public static void main(String[] args) {
		/*FileFilter filter= new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				
				return pathname.getName().endsWith(".java");
			}
		};*/
		//lambda expression 
		FileFilter fileFilterlambda=(File pathname)->pathname.getName().endsWith(".java");
		File dir=new File("D:/sushil");
		File [] files=dir.listFiles(fileFilterlambda);
		for(File f:files){
			System.out.println(f);
		}
	}

}

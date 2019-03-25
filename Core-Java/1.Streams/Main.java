package com.techm.sushil;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Main {

	public static void main(String[] args) {
		//doTryCatchFinally();
		//doTryWithReSources();
		 //doTryWithReSourcesMulti();
		// doClose();
	}
	
	//Method with Try Catch Finally
	public static void doTryCatchFinally(){
		char[] buff = new char[8];
		int length;
		Reader reader = null;
		try {
			reader = new FileReader("abc.txt");
			//length = reader.read(buff);
			while((length= reader.read(buff)) >= 0) {
				System.out.println("Length:" + length);
				for (int i = 0; i < length; i++) 
					System.out.println(buff[i]);
				}
		    } catch (IOException e) {
	            System.out.println(e.getClass()+"-"+e.getMessage());
			}finally {
				try{
				if(reader!=null){
					reader.close();
				}
				}catch(IOException e2) {
				       System.out.println(e2.getClass()+"-"+e2.getMessage());
				}
			}
		}
	
	     //Method with Try Resource
	     public static void doTryWithReSources(){
		   char[] buff = new char[8];
		   int length;
		   try (Reader reader = new FileReader("abc.txt")){
			  // length = reader.read(buff);
			  while ((length = reader.read(buff)) >= 0) {
				  System.out.println("\nLength:" + length);
				  for (int i = 0; i < length; i++)
					  System.out.print(buff[i]);
			      }
		       } catch (IOException e) {
			          System.out.println(e.getClass() + "-" + e.getMessage());
		       } 
		   	}
	    
	     //Method with Try Resource Copy from 1 to another
	     public static void doTryWithReSourcesMulti(){
			   char[] buff = new char[8];
			   int length;
			   try (Reader reader = new FileReader("abc.txt");
					Writer writer = new FileWriter("abcOther.txt")){
				  // length = reader.read(buff);
				  while ((length = reader.read(buff)) >= 0) {
					  System.out.println("\nLength:" + length);
					  writer.write(buff,0,length);
				      }
			       } catch (IOException e) {
				          System.out.println(e.getClass() + "-" + e.getMessage());
			       } 
			   	}
	     
	     //closing method
	     public static void doClose(){
	     try(MyAutoCloseable my=new MyAutoCloseable()){
	     my.saySomething();	 
	     }catch(IOException e3){
	     System.out.println(e3.getClass() + "-" + e3.getMessage()); 
	     }	 
	     }
	
	    }



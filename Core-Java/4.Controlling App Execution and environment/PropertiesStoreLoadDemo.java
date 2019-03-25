package com.techm.sushil;

import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertiesStoreLoadDemo {

	public static void main(String[] args) {
		Properties props=new Properties();
		props.setProperty("dispalyName", "Sushil");
		props.setProperty("AccountNumber", "123-456-789");
		try(Writer writer=Files.newBufferedWriter(Paths.get("xyz.properties"))){
			props.store(writer,"Mycomment");
		}catch(Exception e){
			System.out.println(e.getClass()+"--"+e.getMessage());
		}
		
		try(Reader reader=Files.newBufferedReader(Paths.get("xyz.properties"))){
			props.load(reader);
			String displayName=props.getProperty("dispalyName");
			String AccountNumber=props.getProperty("AccountNumber");
			System.out.println(displayName+"  "+AccountNumber);
		}catch(Exception e){
			System.out.println(e.getClass()+"--"+e.getMessage());
		}

	}

}

package com.techm.sushil;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertiesLoadStoreByXmlDemo {

	public static void main(String[] args) {
			Properties props=new Properties();
			props.setProperty("dispalyName", "Sushil");
			props.setProperty("AccountNumber", "123-456-789");
			try(OutputStream out=Files.newOutputStream(Paths.get("props1.xml"))){
				props.storeToXML(out,"Mycomment");
			}catch(Exception e){
				System.out.println(e.getClass()+"--"+e.getMessage());
			}
			
			try(InputStream in=Files.newInputStream(Paths.get("props1.xml"))){
				props.loadFromXML(in);
				String displayName=props.getProperty("dispalyName");
				String AccountNumber=props.getProperty("AccountNumber");
				System.out.println(displayName+"  "+AccountNumber);
			}catch(Exception e){
				System.out.println(e.getClass()+"--"+e.getMessage());
			}

		}


		

	}



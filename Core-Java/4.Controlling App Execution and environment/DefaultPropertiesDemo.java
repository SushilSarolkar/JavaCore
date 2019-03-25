package com.techm.sushil;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DefaultPropertiesDemo {

	public static void main(String[] args) {
		     
		try{    Properties defaultprops=new Properties();
				try(InputStream inputStream=DefaultPropertiesDemo.class.getResourceAsStream("myDefaultValues.xml")){
					defaultprops=loadF
				}
				Properties userprops=new Properties(defaultprops);
				loadUserProps(userprops);
				String welcomemsg=userprops.getProperty("welcomemsg");
				String farewell msg=userprops.getProperty("farewell");
				
				if (userprops.getProperty(isFirstRun).equalIngoreCase("y")){
					userprops.setProperty(welcomemsg, "welcome back");
					userprops.setProperty(farewell, "things will be familier now");
					userprops.setProperty(welcomemsg, "N");
					SaveUserProps(userprops);
				}
				
			 }catch(Exception e){
			     System.out.println(e.getClass()+"--"+e.getMessage());	
			    }
			
		}
			
	}
			private static Properties loadUserProps(Properties userProps)throws IOException{
				Path userFile=Paths.get(userValues.xml);
				if(file.exist(userFile)){
					try(InputStream inputStream=Files.newInputStream(userFile)){
					userProps.loadFromXML(inputStream);
					}
				}
				return userProps;
			}
			
			private static void saveUserProps(Properties userProps) throws IOException{
			try(OutputStream outputStream=Files.newOutputStream(Paths.get("userValvues.xml"))){
					userProps.storeToXML(outputStream, null);
					}
			}
	}

}

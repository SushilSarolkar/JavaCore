package com.techm.sushil;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LogMethodsDemo {
	public static Logger logger=LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main(String[] args) {
		String left="Sushil";
		String right="Sarolkar";
		//1.Simple log Method
		logger.log(Level.SEVERE,"this is severe with complete method");
		
		//2.Level Convenience method
		logger.severe("severe msg by using convenience method");
		
		//3.precise log method
		logger.logp(Level.SEVERE,"com.techm.sushil.LogMethodsDemo", "main", " this is severe with logp i.e. precise method of logging");
		
		//4.precise convenience method(always logged as finer n used for entering,return )
		doWork();
		//5.Parametrised message method
		logger.log(Level.INFO,"{0} is my fevourite number",9);
		logger.log(Level.INFO,"{0} is {1} day from {2}",new Object[] {"web",2,"friday"} );
		
		doAnotherWork(left, right);
	}
		//for precise convenience method
		public static void doWork(){
			logger.entering("com.techm.sushil.LogMethodsDemo", "main");
			logger.logp(Level.INFO, "com.techm.sushil.LogMethodsDemo", "main","precise convenience method using entering and exeting" );
			logger.exiting("com.techm.sushil.LogMethodsDemo", "main");
		}
		// Parametrised message method
		public static void doAnotherWork(String left,String right){
			logger.entering("com.techm.sushil.LogMethodsDemo", "main",new Object[]{left,right});
/*			logger.logp(Level.INFO, "com.techm.sushil.LogMethodsDemo", "main","precise convenience method using entering and exeting" );
*/			String res=left+right;
			logger.exiting("com.techm.sushil.LogMethodsDemo",res); 

		}

}

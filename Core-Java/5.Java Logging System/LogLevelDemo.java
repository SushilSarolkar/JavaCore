package com.techm.sushil;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LogLevelDemo {

	public static Logger logger=LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main(String[] args) {
		logger.setLevel(Level.INFO);
		//only set level and above level logging is accpeted
		logger.log(Level.SEVERE, "this is an error message");
		logger.log(Level.WARNING,"hey..this is warning message");
		//Below 2 levels will not log because their level are lesser than set level.
		logger.log(Level.FINE,"this level is fine level");
		logger.log(Level.FINER,"this if finar level of logging");
		

	}

}

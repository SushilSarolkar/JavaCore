package com.techm.sushil;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class CallMakingDemo {

	static Logger logger=LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main(String[] args) {
		logger.log(Level.INFO, "this is my first log which is Info");
		logger.log(Level.INFO,"hurrey.........Logged ");

	}

}

package com.techm.sushil;

import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogComponentBasicDemo {
	 static Logger logger=Logger.getLogger("com.sushil");
	    public static void main(String[] args) {
		Handler h=new ConsoleHandler();
		Formatter f=new SimpleFormatter();
		h.setFormatter(f);
		logger.addHandler(h);
		logger.setLevel(Level.INFO);
		logger.log(Level.INFO, "we are logging");
	}

}

package com.poc.cc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
	
	private static final Logger logger = LoggerFactory.getLogger(Calculator.class);
	
	public Integer extrapolate(Integer lo, Integer ro) {
		logger.info("Entered Method extrapolate()");
		logger.debug("DEBUG:Entered Method extrapolate()");
		long startTime = System.currentTimeMillis();
		Integer tempResult = lo + ro;
		logger.info("Temp result - Initial =  {}", tempResult);
		logger.debug("DEBUG:Temp result - Initial =  {}", tempResult);
		if((System.currentTimeMillis() - startTime) > 100 ) {
			logger.info("Inside if Block of extrapolate()");
			tempResult = Double.valueOf(tempResult * 0.8).intValue();
			logger.info("Temp result - 1 =  {}", tempResult);
		}
		if(logger.isDebugEnabled()) {
			logger.debug("I am in debug mode {}", "Rakesh Tiwary");
		}
		logger.info("Temp result - Final =  {}", tempResult);
		logger.info("Exiting Method extrapolate()");
		return tempResult;
	}
	
	public Integer compute(Integer lo, Integer ro) {
		logger.info("Entered Method compute()");
		long startTime = System.currentTimeMillis();
		//Logger
		Integer tempResult = lo + ro;
		if((System.currentTimeMillis() - startTime) > 100 ) {
			logger.info("Inside if Block of compute()");
			tempResult = Double.valueOf(tempResult * 0.8).intValue();
			logger.info("Temp result - 1 =  {}", tempResult);
		}else {
			logger.info("Inside else Block of compute()");
			tempResult = Double.valueOf(tempResult * 0.9).intValue();
			logger.info("Temp result - 2 =  {}", tempResult);
		}
		logger.info("Temp result - Final =  {}", tempResult);
		logger.info("Entered Method compute()");
		return tempResult;
	}

}

package ut.com.poc.cc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mockit.Mock;
import mockit.MockUp;

public class LoggerFactoryMock extends MockUp<LoggerFactory> {
	
	private static Logger logger;
	public LoggerFactoryMock(Logger log) {
		logger = log;
	}
	@Mock
	public static Logger getLogger(Class<?> clazz) {
		return logger;
	}
	
}

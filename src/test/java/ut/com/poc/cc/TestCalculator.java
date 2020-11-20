package ut.com.poc.cc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.poc.cc.Calculator;

import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;
import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
public class TestCalculator {

	/*
	 * @Mocked private LoggerMock logger;
	 * 
	 * @Before public void setUp() {
	 * 
	 * new MockUp<LoggerFactory>() {
	 * 
	 * @Mock public Logger getLogger() { return logger; } }; }
	 */

	@Test
	public void testExtrapolate() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(11, calculator.extrapolate(5, 6).intValue());
	}

}

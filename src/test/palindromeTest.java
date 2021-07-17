package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class palindromeTest {
	@BeforeEach
	public  void setup()
	{
		System.setProperty("ENV", "DEV");
	}
	//This method only executes only if environment is "Dev"
	@Test
	public void positivetest()
	{
		assumeTrue("DEV".equals(System.getProperty("ENV")));
		assertTrue(Palindromeimplement.palintest("madam"));
	}
	//This method only executes only if environment is "Prod"
	@Test
	public void negativetest()
	{
		assumeTrue("PROD".equals(System.getProperty("ENV")));
		assertFalse(Palindromeimplement.palintest("madame"));
	}


}

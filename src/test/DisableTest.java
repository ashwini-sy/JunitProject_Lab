package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class DisableTest {
 @DisplayName("POSTIVETEST")
	@Disabled
	@Test
	public void positivetest()
	{
		
		assertTrue(Palindromeimplement.palintest("madam"));
	}
 @DisplayName("NEGATIVETEST")
 @RepeatedTest(5)
	@Test
	public void negativetest()
	{
		
		assertFalse(Palindromeimplement.palintest("madame"));
	}
}

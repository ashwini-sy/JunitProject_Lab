package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public interface TestInterface {
	
	public void method();
	@Test
	default void test1()
	{
		assertTrue(Palindromeimplement.palintest("madam"));
	}
	
	

}
package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
public class AssertionExample {
	@Test
	public void test()
	{
		//comparision of 2 string
		String expected="hi";
		String actual="hi";
		//first method
		Assertions.assertEquals(expected, actual);
		//2nd method
		assertEquals(expected, actual);
		
		//Comparision of 2 string Array
		String[] exarray= {"one","hi"};
		String[] actarray= {"one","hi"};
		
		assertArrayEquals(exarray, actarray);
	}

}

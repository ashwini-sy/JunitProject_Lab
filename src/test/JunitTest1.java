package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class JunitTest1 {
	@BeforeAll
	public static void  testcaseBrforAll()
	{
		System.out.println("inside before all method");
	}
	@BeforeEach
	public void testcaseBEforeEach()
	{
		System.out.println("inside before each method");
	}
	@Test
	public void testcaseTest1()
	{
		System.out.println("inside test1 method");
		boolean flag=true;
		Assertions.assertTrue(flag);
		
		
	}
	
	
	@AfterEach
	public void testcaseAfterEach()
	{
		System.out.println("inside after each method");
	}
	
	@AfterAll
	public static void testcaseAfterAll()
	{
		System.out.println("inside after all method");
	}
}

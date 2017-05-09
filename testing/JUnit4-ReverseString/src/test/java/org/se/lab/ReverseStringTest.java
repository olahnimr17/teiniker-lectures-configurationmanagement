package org.se.lab;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseStringTest
{
	private Service service;
	
	@Before
	public void setup()
	{
		// Setup
		service = new Service();	
	}
	
	@After
	public void teardown()
	{
		// not needed for objects
	}
	
	@Test
	public void testReverseString() // Happy path test
	{
		// Execrsie
		String s = "Hello KBerg!";
		String reverse = service.reverseString(s);
		
		// Verify
        Assert.assertEquals("!greBK olleH", reverse);
	}
}

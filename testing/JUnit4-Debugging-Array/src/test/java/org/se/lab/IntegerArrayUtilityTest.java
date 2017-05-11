package org.se.lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntegerArrayUtilityTest
{
	public IntegerArrayUtility util;
	
	@Before
	public void setup()
	{
		util = new IntegerArrayUtility();
	}
	
	@Test
	public void testReverseWithEvenNumberOfElements()
	{
		int[] array = {1,2,3,4,5,6,7,8};		
		util.reverse(array);
		
		int[] expected = {8,7,6,5,4,3,2,1};
		Assert.assertArrayEquals(expected, array);
	}

	@Test
	public void testReverseWithOddNumberOfElements()
	{
		int[] array = {1,2,3,4,5,6,7};		
		util.reverse(array);
		
		int[] expected = {7,6,5,4,3,2,1};
		Assert.assertArrayEquals(expected, array);
	}

}

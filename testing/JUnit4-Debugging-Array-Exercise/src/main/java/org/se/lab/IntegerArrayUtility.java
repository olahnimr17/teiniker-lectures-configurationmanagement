package org.se.lab;

public class IntegerArrayUtility
{
	/**
	 * Reverse the order of integer elements in a given array.
	 * 
	 * Example: 1,2,3,4,5,6,7 --reverse()-> 7,6,5,4,3,2,1
	 */
	public void reverse(int[] array)
	{
		int count = array.length / 2;
		
		for(int i=0; i<count; i++)
		{
			int tmp = array[array.length-i];
			array[array.length-i] = array[i];
			array[i] = tmp;
		}
	}
}

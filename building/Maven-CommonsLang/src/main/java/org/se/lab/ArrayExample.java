package org.se.lab;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayExample
{

	public static void main(String[] args)
	{
		String[] array = ArrayUtils.toArray("one", "two", "three");	
		System.out.println(ArrayUtils.toString(array));
		
		array = ArrayUtils.add(array, "four");
		System.out.println(ArrayUtils.toString(array));
		
		if(ArrayUtils.contains(array,"two"))
		{
			System.out.println("found \"two\" in the array.");
		}
		
		ArrayUtils.reverse(array);
		System.out.println(ArrayUtils.toString(array));
	}
}

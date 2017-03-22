package org.se.lab;

import java.util.Arrays;

public class Vector
{
	private final int[] elements;
	
	public Vector(int... elements)
	{
		if(elements == null)
			throw new IllegalArgumentException("elements is null!");
	
		this.elements = Arrays.copyOf(elements, elements.length);
	}
	
	public int size()
	{
		return elements.length;
	}
	
	public int get(int index)
	{
		if(index >= size())
			throw new IllegalArgumentException("Invalid index " + index + "!");
		
		return elements[index];
	}
	
	public static Vector add(Vector a, Vector b)
	{
		if(a.size() != b.size())
			throw new IllegalArgumentException("Vectors must be of same size!");
	
		int size = a.size();
		int[] result = new int[size];
		for(int i=0; i<size; i++)
		{
			result[i] = a.get(i) + b.get(i);
		}
		return new Vector(result);
	}


	
	
	/*
	 * Object methods
	 */
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(elements);
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vector other = (Vector) obj;
		if (!Arrays.equals(elements, other.elements))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return Arrays.toString(elements);
	}
}

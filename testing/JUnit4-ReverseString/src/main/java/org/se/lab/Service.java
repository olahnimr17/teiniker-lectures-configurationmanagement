package org.se.lab;

public class Service
{
    public String reverseString(String input)
    {
        return new StringBuilder(input).reverse().toString();
    }
}

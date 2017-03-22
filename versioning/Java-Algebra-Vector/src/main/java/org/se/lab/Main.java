package org.se.lab;

public class Main
{
    public static void main(String... args)
    {
        Vector v1 = new Vector(1,2,3,4,5);
        Vector v2 = new Vector(3,2,1,4,5);
        
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        
        System.out.println("v1 + v2 = " + Vector.add(v1, v2));
    }
}

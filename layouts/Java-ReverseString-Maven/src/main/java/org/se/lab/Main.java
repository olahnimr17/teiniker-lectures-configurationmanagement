package org.se.lab;

public class Main
{
    public static void main(String... args)
    {
        Reverse service = new Reverse();
        String s = "Hello KBerg!";

        String t = service.reverseString(s);
        System.out.println(t);
    }
}

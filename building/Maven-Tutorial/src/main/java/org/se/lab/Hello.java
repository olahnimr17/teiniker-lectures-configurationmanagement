package org.se.lab;

public class Hello
{
    public static final String HELLO = "Hello ";
 
    public static void main(String[] args)
    {
        Hello hello = new Hello();
        int number = hello.sayHello("Kapfenberg");
        System.out.println("Anzahl der ausgegebenen Zeichen: " + number);
    }

    public int sayHello(String name)
    {
        String msg = HELLO + name + "!";
        System.out.println(msg);
        return msg.length();
    }
}

package com.company.Assignment_6;

public class chaining {
    public chaining()
    {
        this(10);
        System.out.println("Default Constructor");
    }
    public chaining(int x)
    {
        this(x,x+10);
        System.out.println("In First constructor");
    }
    public chaining(int x ,int y)
    {
        System.out.println("Call made to second constructor");
    }
    public static void main(String[]args)
    {
        chaining c = new chaining();

    }
}

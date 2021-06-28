package com.company.Assignment_5;

public class Singleton {
    /*comment static to view the result*/static String non_Static;
    public static Singleton static_Method(String str)
    {
        non_Static=str;
        Singleton sc = new Singleton();
        return sc;
    }
    public void print_String()
    {
        System.out.println(non_Static);
    }
}

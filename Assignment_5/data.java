package com.company.Assignment_5;

public class data {
    int global_int;
    char global_char;

    public void printUnInstantiatedGlobalVariables()
    {
        System.out.println(global_int);
        System.out.println(global_char);
    }

    public void printUnInstantiatedLocalVariables()
    {
        int instance_int;
        char instance_char;
       // System.out.println(instance_int+" "+instance_char); // uncomment the line in assignment
    }
}

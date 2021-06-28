package com.company.Assignment_5;

public class Main {
    public static void main(String[]args) {
        data d = new data();
        d.printUnInstantiatedGlobalVariables();
        d.printUnInstantiatedLocalVariables();
        Singleton sc = Singleton.static_Method("Hey");
         sc.print_String();
    }
}

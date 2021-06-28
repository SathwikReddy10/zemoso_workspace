package com.company.Assignment_7.Interface_Example;

public class Implementation extends concrete_class implements ICombinedof3{

    @Override
    public void combined() {
        System.out.println("combined call");
    }

    @Override
    public void sample1_method1() {
        System.out.println("sample1_method1 call");
    }

    @Override
    public void sample1_method2() {
        System.out.println("sample1_method2 call");
    }

    @Override
    public void sample2_method1() {
        System.out.println("sample2_method1 call");
    }

    @Override
    public void sample2_method2() {
        System.out.println("sample2_method2 call");
    }

    @Override
    public void sample3_method1() {
        System.out.println("sample3_method1 call");
    }

    @Override
    public void sample3_method2() {
        System.out.println("sample3_method2 call");
    }

    public void implementation_Isample1(Isample1 sample)
    {
        System.out.println("implementation_Isample1 call");
    }

    public void  implementation_Isample2(Isample2 sample)
    {
        System.out.println("implementation_Isample2 call");
    }

    public void implementation_Isample3(Isample3 sample)
    {
        System.out.println("implementation_Isample3 call");
    }

    public void implementation_Icombinedof3(ICombinedof3 combine)
    {
        System.out.println("implementation_Icombinedof3 call");
    }
}

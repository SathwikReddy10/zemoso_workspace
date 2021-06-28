package com.company.javaAssignments;

import java.util.Scanner;

public class Assignment_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int excChoice = sc.nextByte();
        try {
            if (excChoice == 1) {
                throw new Exception1("Exception of I st kind");
            } else if (excChoice == 2) {
                throw new Exception2("Exception of II nd kind");
            } else if (excChoice == 3) {
                throw new Exception3("Exception of III rd kind");
            }
            else
                throw new NullPointerException("Null Pointer Exception ocuured");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally executes after Any exception");
        }
    }
}
    class Exception1 extends Exception
    {
        Exception1(String str)
        {
            super(str);
        }
    }
    class Exception2 extends Exception
    {
        Exception2(String str)
        {
            super(str);
        }
    }
    class Exception3 extends Exception
    {
        Exception3(String str)
        {
            super(str);
        }
    }
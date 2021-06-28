package com.company.javaAssignments;

import java.util.HashSet;
import java.util.Scanner;

public class Assignment_2 {

    public static boolean checkIfAllAlphabetsPresent(String str)
    {
        HashSet<Character> hset=new HashSet<>();
        for (char c:str.toCharArray())
        {
            if(Character.isAlphabetic(c))
                hset.add(c);
        }
        if(hset.size()==26)
            return true;
        return false;
    }

    public static boolean checkWithStreams(String str)
    {
        return str.chars().filter(i -> i>='a' && i<='z').distinct().count()==26;
    }

    public static boolean checkWithRegex(String str)
    {
        return str.replaceAll("[^a-z]","").length()==26;
    }

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        str=str.toLowerCase();
        System.out.println(checkIfAllAlphabetsPresent(str));
        System.out.println(checkWithStreams(str));
        System.out.println(checkWithRegex(str));
    }
}

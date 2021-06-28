package com.company.Assignment_9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternMatching {

    public boolean match(String str)
    {
        Pattern pattern = Pattern.compile("^[A-Z][^\\.][^\\.]*\\.$");
        Matcher m = pattern.matcher(str);
        if(m.matches())
        {
            return true;
        }
        return false;
    }

    public static void main(String[]args)
    {
        patternMatching pm = new patternMatching();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(pm.match(str));
    }
}

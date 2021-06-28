package com.company.javaAssignments;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Assignment_1 {
    public ArrayList<String> matchFiles(String targetFileREGEX)
    {
        ArrayList<String> fileList = new ArrayList<>();
        File file = new File("/home/sathwk");
        File[] filesList = file.listFiles();
        Pattern pattern = Pattern.compile(targetFileREGEX);
        for(File fileName:filesList){
            Matcher matcher = pattern.matcher(fileName.getName());
            if(matcher.find()){
                fileList.add(fileName.getAbsolutePath());
            }
        }
        return fileList;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        Assignment_1 ass_variable = new Assignment_1();
        System.out.println("Specify path to home directory");
        do {
            String targetFileREGEX= sc.next();
            System.out.println(ass_variable.matchFiles(targetFileREGEX));
        }while (true);
    }
}

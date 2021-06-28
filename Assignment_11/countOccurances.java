package com.company.Assignment_11;

import edu.duke.FileResource;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class countOccurances {
    public static void main(String[]args) throws IOException {
        FileResource file = new FileResource();
        HashMap<Character,Integer> hmap =new HashMap<>();
        for (char ch: file.asString().toCharArray())
        {
            hmap.put(ch, hmap.getOrDefault(ch,0)+1);
        }
        try{
            File newFile=new File("output.txt");
            if(newFile.createNewFile())
            {
                System.out.println("new file created");
            }
            else
                System.out.println("Same file already exists");
            FileWriter writer=new FileWriter(newFile);
            for(var pair:hmap.entrySet())
            {
                if(Character.isAlphabetic(pair.getKey()))
                    writer.write(pair.getKey()+" : "+pair.getValue()+"\n");
            }
            writer.close();
        }
        catch (IOException e)
        {
            System.out.println(e.getStackTrace());
        }
    }
}

package com.company.proofOfWork;

import edu.duke.FileResource;

import java.util.ArrayList;
import java.util.HashMap;

public class WordFrequencies {
    private ArrayList<String> myWords;
    private ArrayList<Integer>myFreqs;
    public WordFrequencies()
    {
        myWords=new ArrayList<String>();
        myFreqs=new ArrayList<Integer>();
    }
    public void findUnique()
    {
        FileResource resource = new FileResource();
        for(String s : resource.words())
        {
            s=s.toLowerCase();
            int index=myWords.indexOf(s);
            if(index==-1)
            {
                myWords.add(s);
                myFreqs.add(1);
            }
            else
            {
                int value=myFreqs.get(index);
                myFreqs.set(index,value+1);
            }
        }
    }
    public void maxOccuringElement()
    {
        String res = new String();
        int max=Integer.MIN_VALUE;
        for (int i=0;i<myFreqs.size();i++)
        {
            if(max<myFreqs.get(i))
            {
                max=myFreqs.get(i);
                res=myWords.get(i);
            }
        }
        System.out.println(res+"\t"+max);
    }
    public void countWordsHashMap()
    {
        FileResource fr = new FileResource();
        HashMap<String,Integer> hmap=new HashMap<>();
        int total=0;
        for(String w: fr.words())
        {
            w=w.toLowerCase();
            hmap.put(w,hmap.getOrDefault(w,0)+1);
        }
        System.out.println(hmap);
    }
    public void tester() {
        findUnique();
        System.out.print("# Unique words: " + myWords.size());
        for (int k = 0; k < myWords.size(); k++) {
            System.out.println(myFreqs.get(k) + "\t" + myWords.get(k));
        }
        System.out.print("The word that occurs most often and its count are: ");
        maxOccuringElement();
        countWordsHashMap();
    }
    public static void main(String[]args)
    {
        WordFrequencies wf=new WordFrequencies();
        wf.tester();
    }
}

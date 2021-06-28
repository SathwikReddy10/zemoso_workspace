package com.company.Assignment_6;

import java.util.ArrayList;

public class vampire {
    public static ArrayList<String> permutations = new ArrayList<>();
    public void findPermutations(String str, String curr)
    {
        if(str.length()==0)
        {
            permutations.add(curr);
            return ;
        }
        for (int i=0;i< str.length();i++)
        {
            char ch = str.charAt(i);
            findPermutations(str.substring(0,i)+str.substring(i+1),curr+ch);
        }
    }

    public boolean isVampire(ArrayList<String>list, int start)
    {
        for (int i=0;i<list.size();i++)
        {
            String test = list.get(i);
            int first = Integer.parseInt(test.substring(0,test.length()/2));
            int end = Integer.parseInt(test.substring((test.length()/2)));
            long mul = first*end;
            int firstLength = (int) (Math.log10(first)+1);
            int secondLength = (int) (Math.log10(end)+1);
            //System.out.println(mul+" "+test+" "+first+" "+end+" "+Long.parseLong(test));
            if(mul==Long.parseLong(String.valueOf(start)) && firstLength ==test.length()/2 && secondLength==test.length()/2)
            {
                //System.out.println(test+" "+start+" "+first+" "+end+" "+mul);
                return true;
            }
        }
        return false;
    }

    public static void main(String[]args)
    {
        vampire v =new vampire();
        ArrayList<String> vampires = new ArrayList<>();
        int n = 100;
        int start = 1;
        while(n >0)
        {
            int len = (int) (Math.log10(start)+1);
            if(len % 2 == 0)
            {
                v.findPermutations(String.valueOf(start),"");
                //System.out.println(permutations);
                if(v.isVampire(permutations,start))
                {
                    vampires.add(String.valueOf(start));
                    n--;
                }
            }
            start++;
            permutations.clear();
        }
        System.out.println(vampires);
    }
}

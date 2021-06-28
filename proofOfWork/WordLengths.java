package com.company.proofOfWork;

public class WordLengths {
    public int[] countWordLengths(String input, int []count)
    {
        for(String str: input.split(" "))
        {
            if(Character.isLetter(str.charAt(0))) {
                int len = str.length();
                count[len]++;
            }
        }
        return count;
    }
    public int indexOfMax(int[] count)
    {
        int max=Integer.MIN_VALUE;
        int ind=-1;
        for(int i=0;i<count.length;i++)
        {
            if(max<count[i])
            {
                max=Math.max(max,count[i]);
                ind=i;
            }
        }
        return ind;
    }

}

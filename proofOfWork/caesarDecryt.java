package com.company.proofOfWork;

public class caesarDecryt {
    public int decrypt(String s)
    {
        int[] freqs = CountLetters(s);
        int maxDex = maxIndex(freqs);
        int dKey = maxDex - 4;
        if (maxDex < 4) {
            dKey = 26 - (4 -maxDex);
        }
        return dKey;
    }
    public int[] CountLetters(String message) {
        String alph = "abcdefghijklmnopqrstuvwxyz";
        int[] counts = new int[26];
        for(int k=0; k < message.length();k++) {
            char ch = Character.toLowerCase(message.charAt(k));
            int dex = alph.indexOf(ch);
            if(dex!=-1) {
                counts[dex]++;
            }

        }
        return counts;
    }

    //maxIndex
    public int maxIndex(int[] values) {

        int max = 0;
        int indexOfMax = 0;
        for(int k = 0;k<values.length;k++) {
            if (values[k]> max) {
                max = values[k];
                indexOfMax = k;
            }

        }
        //System.out.println("The Array maxIndex is :"+ indexOfMax);
        return indexOfMax;
    }
}

package com.company.proofOfWork;

public class caesarCipher {
    public String encryt(String input, int key) {
        StringBuilder encrypted = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0, key);
        for (int i = 0; i < encrypted.length(); i++) {
            char currChar = encrypted.charAt(i);
            boolean low = false;
            if(Character.isLowerCase(currChar))
            {
                low=true;
                currChar=Character.toUpperCase(currChar);
            }
            int idx = alphabet.indexOf(currChar);
            if (idx != -1) {
                char newChar = shiftedAlphabet.charAt(idx);
                if(low)
                    encrypted.setCharAt(i,Character.toLowerCase(newChar));
                else
                    encrypted.setCharAt(i, newChar);
            }
        }
        return encrypted.toString();
    }

    public String encrytTwoKeys(String input, int key1, int key2) {
        StringBuilder encrypted = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet_key1 = alphabet.substring(key1) + alphabet.substring(0, key1);
        String shiftedAlphabet_key2 = alphabet.substring(key2) + alphabet.substring(0, key2);
        for (int i = 0; i < encrypted.length(); i++) {
            char currChar = encrypted.charAt(i);
            boolean low = false;
            if(Character.isLowerCase(currChar)) {
                low = true;
                currChar = Character.toUpperCase(currChar);
            }
            if (i % 2 == 0) {
                int idx = alphabet.indexOf(currChar);
                if (idx != -1) {
                    char newChar = shiftedAlphabet_key1.charAt(idx);
                    if(low)
                        encrypted.setCharAt(i,Character.toLowerCase(newChar));
                    else
                        encrypted.setCharAt(i, newChar);
                }
                }
            else {
                  int idx = alphabet.indexOf(currChar);
                if (idx != -1) {
                    char newChar = shiftedAlphabet_key2.charAt(idx);
                    if(low)
                        encrypted.setCharAt(i,Character.toLowerCase(newChar));
                    else
                        encrypted.setCharAt(i, newChar);
                }
            }
        }
        return encrypted.toString();
    }
}

package com.company.proofOfWork;

public class coursera {
    public static void main(String[]args)
    {
        caesarCipher c_Cipher = new caesarCipher();
        caesarDecryt c_decrypt = new caesarDecryt();
        String encrypted = c_Cipher.encryt("First LEGION ATTACK EAST FLANK!",17);
        System.out.println(encrypted);
        int dec_key = c_decrypt.decrypt(encrypted);
        String decrypted = c_Cipher.encryt(encrypted,26-dec_key);
        System.out.println(decrypted);
        System.out.println(c_Cipher.encrytTwoKeys("First Legion",23,17));

        WordLengths w_length=new WordLengths();
        int count[]=new int[31];
        String str="Laer. My necessaries are embark'd. Farewell. And, sister, as the winds give benefit";
        str = str.replaceAll("[-+.^:,]","");
        System.out.println(str);
        count=w_length.countWordLengths(str,count);
        System.out.print(w_length.indexOfMax(count));
    }
}

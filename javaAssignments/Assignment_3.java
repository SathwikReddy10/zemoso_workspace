package com.company.javaAssignments;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment_3 {

    public void pingAddress(String host)
    {
        int n=3;
        long times_Taken[]=new long[n];
        String result = new String();
        while(n-->0) {
            try {
                long start = System.nanoTime();
                InetAddress addr = InetAddress.getByName(host);
                result=addr.toString();
                long end = System.nanoTime();
                long timeElapsed = end - start;
                times_Taken[n]=timeElapsed;
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        }
        System.out.println(result);
        System.out.print("Median time taken is "+getMedian(times_Taken));
    }

    public long getMedian(long times[])
    {
        Arrays.sort(times);
        return times[times.length/2];
    }

    public static void main(String[]args)
    {
        Assignment_3 ass_var = new Assignment_3();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target host to be pinged: ");
        String host_Address=sc.next();
        ass_var.pingAddress(host_Address);
    }
}

package com.company;

import java.util.*;

class Point
{
    int first;
    int second;
    public Point(int first, int second)
    {
        this.first=first;
        this.second=second;
    }
}

public class Main {

    public static double caluculatedistance(Point one,Point two)
    {
        double res=0;
        int x1=one.first;
        int y1= one.second;
        int x2= two.first;
        int y2= two.second;
        double x=Math.pow((x2-x1),2);
        double y=Math.pow((y2-y1),2);
        res=Math.sqrt(y+x);
        System.out.print("\t"+res+"\t");
        return res;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Point>al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            al.add(new Point(s.nextInt(), s.nextInt()));
        }
        double totalperim=0;
        Point prev= al.get(n-1);
        for(Point temp : al)
        {
            double perim=caluculatedistance(prev,temp);
            System.out.println(perim+ " "+ prev.first+" "+prev.second+" "+temp.first+" "+temp.second);
            totalperim+=perim;
            prev=temp;
        }
        System.out.println(totalperim);
        s.close();
    }
}

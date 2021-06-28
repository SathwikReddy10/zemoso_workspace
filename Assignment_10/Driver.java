package com.company.Assignment_10;

import java.util.Scanner;

public class Driver {
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        SList head =null;
        System.out.println("Enter no of elements");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int data = sc.nextInt();
            SList<Integer> node= new SList<>(data);
            if(head==null)
            {
                head = node;
            }
            else
            {
                SList temp = head;
                while (temp.next!=null)
                    temp=temp.next;
                temp.next = node;
            }
        }
        System.out.println("Elements in generic list are : ");
        SListIterator itr = new SListIterator(head);
        itr.iterator();
    }
}

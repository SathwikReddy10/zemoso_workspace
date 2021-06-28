package com.company.Assignment_10;

public class SListIterator {
    SList temp_Node = null;
    SListIterator(SList head)
    {
        temp_Node = head;
    }

    public void iterator()
    {
        if(temp_Node!=null)
        {
            while (temp_Node!=null)
            {
                System.out.println(temp_Node.data);
                temp_Node=temp_Node.next;
            }
        }
        else
        {
            System.out.println("List is Empty");
        }
    }
}

package com.company.Assignment_7;

public class Second_InOut {
    public class Second_Inner extends First_InOut.InnerClass
    {
        public Second_Inner(String str)
        {
            new First_InOut().super(str);
            System.out.println("In the second inner class");
        }
    }
}

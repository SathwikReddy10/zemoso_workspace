package com.company.solidprinciples;

public class DriverCode {
    public static void main(String[]args)
    {
        Employee EmpJohn = new PermanentEmployee(1,"John");
        Employee EMPJason = new PermanentEmployee(2,"Jason");
        System.out.print(EmpJohn+ "\t");
        System.out.println(EmpJohn.getMinSalary()+ " " + EmpJohn.CalculateBonus(100000));

        System.out.print(EMPJason+ "\t");
        System.out.println(EMPJason.getMinSalary()+ " " + EMPJason.CalculateBonus(10000));

        System.out.println("Contract Employees :-");
        ContractEmployee EmpMike = new intern(3,"Mike");
        System.out.print(EmpMike+ "\t");
        System.out.println(EmpMike.getMinSalary());
    }
}

package com.company.voilationcode;

public class DriverCode {
    public static void main(String[]args)
    {
        EmployeeInstance empjohn = new PermanentEmployee(1,"john");
        EmployeeInstance empjason = new PermanentEmployee(2,"jason");
        System.out.println(empjohn.toString()+"\t "+empjohn.Salary()+"\t"+empjohn.CaluculateBonus(100000));
        System.out.println(empjason.toString()+"\t "+empjason.Salary()+"\t"+empjason.CaluculateBonus(10000));

        System.out.println("Contarct Employees :-");
        EmployeeInstance empMike = new ContractEmployee(3,"Mike");
        System.out.println(empMike.toString()+"\t "+empMike.Salary()+"\t"+empMike.CaluculateBonus(10000));
    }
}

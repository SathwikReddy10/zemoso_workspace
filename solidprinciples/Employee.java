package com.company.solidprinciples;

public abstract class Employee implements IEmployeeWithBonus, IEmployee {
    private int EMP_ID;
    private String EMP_name;
    public Employee(int id, String name) {
        this.EMP_ID=id;
        this.EMP_name=name;
    }

    @Override
    public String toString() {
        return "PermanentEmployee{" +
                "EMP_ID=" + EMP_ID +
                ", EMP_name='" + EMP_name + '\'' +
                '}';
    }

    public abstract double getMinSalary();
    public abstract double CalculateBonus(double salary);
}

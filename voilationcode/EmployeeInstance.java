package com.company.voilationcode;

public abstract class EmployeeInstance implements Employee{
    int ID;
    String name;
    public EmployeeInstance(int id,String name)
    {
        this.ID=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "EmployeeInstance{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }

    public abstract double Salary();

    public abstract double CaluculateBonus(double salary);
}

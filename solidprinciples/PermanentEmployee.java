package com.company.solidprinciples;

public class PermanentEmployee extends Employee {

    public PermanentEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public double getMinSalary() {
        return 15000;
    }

    @Override
    public double CalculateBonus(double salary) {
        return ((salary * 10) / 100);
    }
}

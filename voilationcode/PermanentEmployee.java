package com.company.voilationcode;

public class PermanentEmployee extends EmployeeInstance{

    public PermanentEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double Salary() {
        return 15000;
    }

    @Override
    public double CaluculateBonus(double salary) {
        return ((salary * 10)/100);
    }
}

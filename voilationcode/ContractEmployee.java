package com.company.voilationcode;

public class ContractEmployee extends EmployeeInstance{
    public ContractEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double Salary() {
        return 5000;
    }

    @Override
    public double CaluculateBonus(double salary) {
        //System.out.println("No Bonus for Contract Employees");
        return -1;
    }

}

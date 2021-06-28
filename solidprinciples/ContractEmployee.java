package com.company.solidprinciples;

public abstract class ContractEmployee implements IEmployee {
    private int EMP_ID;
    private String EMP_name;
    public ContractEmployee(int id, String name) {
        this.EMP_ID=id;
        this.EMP_name=name;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "EMP_ID=" + EMP_ID +
                ", EMP_name='" + EMP_name + '\'' +
                '}';
    }

    @Override
    public abstract double getMinSalary();
}

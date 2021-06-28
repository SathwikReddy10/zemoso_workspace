package com.company.solidprinciples;

public class intern extends ContractEmployee {
    public intern(int id, String name) {
        super(id, name);
    }

    @Override
    public double getMinSalary() {
        return 5000;
    }


}

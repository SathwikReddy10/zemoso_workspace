package com.company.Assignment_12;

public class Student {
    int id, age , enrollment_year;
    double perTillDate;
    String name, gender, department;
    Student(int id, String name, int age, String gen, String dep , int enroll_year, double date)
    {
        this.id = id;
        this.age = age;
        this.name = name;
        this.gender = gen;
        this.department = dep;
        this.enrollment_year = enroll_year;
        this.perTillDate = date;
    }
    public String getGender() {
        return gender;
    }

    public double getPerTillDate()
    {
        return perTillDate;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}

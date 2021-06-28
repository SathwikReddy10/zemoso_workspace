package com.company.Assignment_12;

import java.util.ArrayList;

public class Driver {
    public static ArrayList<Student> SList = new ArrayList<>();

    public static void main(String[] args) {
        SList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science",2018, 70.8));
        SList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        SList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        SList.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        SList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        SList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        SList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        SList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        SList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        SList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        SList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        SList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        SList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        SList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        SList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        SList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        SList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        Methods m = new Methods();
        System.out.println("Fetching department names -> " + m.getDepartments());
        System.out.println("names of all students who have enrolled after 2018 -> "+m.getSNamesAfterYear());
        System.out.println("male student in the computer sci department -> "+m.getMaleInCSE());
        System.out.println("male and female student -> "+m.getByGender());
        System.out.println("average age of male and female students -> "+m.getAvgAge());
        System.out.print("details of highest student having highest percentage  -> ");
        m.getHighest();
        System.out.print("number of students in each department -> ");
        m.getCountByDept();
        System.out.print("average percentage achieved in each department -> ");
        m.getAvgPercentByDept();
        System.out.print("details of youngest male student in the Electronic department -> ");
        m.getYoungestMaleElectronics();
        System.out.print("male and female students are there in the computer science department ->");
        m.getStudentsByGenderAndDept();
    }
}

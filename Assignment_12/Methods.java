package com.company.Assignment_12;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Methods {
    static Set<String> getDepartments()
    {
        Set<String> department_Names=Driver.SList.stream().map(x->x.department).collect(Collectors.toSet());
        return department_Names;
    }
    static Set<Student> getSNamesAfterYear()
    {
        Set<Student> StudentList=Driver.SList.stream().filter(x->(x.enrollment_year>2018)).collect(Collectors.toSet());
        return StudentList;
    }
    static Set<Student> getMaleInCSE()
    {
        Set<Student> Names=Driver.SList.stream().filter(x->(x.gender.equals("Male") && x.department.equals("Computer Science"))).collect(Collectors.toSet());
        return Names;
    }
    static Map<String, Long> getByGender()
    {
        Map<String, Long> GMap = Driver.SList.stream().collect(Collectors.groupingBy(x->x.gender,Collectors.counting()));
        return GMap;
    }
    static Map<String,Double> getAvgAge()
    {
        Map<String,Double> AvgAge=Driver.SList.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
        return AvgAge;
    }
    static void getHighest()
    {
        var student = Driver.SList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Student::getPerTillDate))).get();
        System.out.println(student.name+": "+student.perTillDate);
    }
    static void getCountByDept()
    {
        Map<String, Long> numberByDept = Driver.SList.stream().collect(Collectors.groupingBy(x->x.department,Collectors.counting()));
        numberByDept.forEach((key,value)->{
            System.out.println(key+": "+value);
        });
    }

    static void getAvgPercentByDept()
    {
        Map<String,Double> AvgPercent= Driver.SList.stream().collect(Collectors.groupingBy(Student::getDepartment, Collectors
                .averagingDouble(Student::getPerTillDate)));
        AvgPercent.forEach((key,value)->{
            System.out.println(key+": "+value);
        });
    }

    static void getYoungestMaleElectronics()
    {
        List<Student> student= Driver.SList.stream().filter(x->(x.gender.equals("Male") && x.department.equals("Electronic"))).collect(Collectors.minBy(Comparator.comparingInt(Student::getAge))).stream().toList();
        for(var s:student)
            System.out.println(s.name+": "+s.age);
    }
    static void getStudentsByGenderAndDept() {
        Map<String, Long> numberByGender = Driver.SList.stream().filter(x->(x.department.equals("Computer Science"))).collect(Collectors.groupingBy(x -> x.gender, Collectors.counting()));

        numberByGender.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });
    }
}

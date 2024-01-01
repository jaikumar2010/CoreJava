package com.jay.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionPractice {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(1,"Java",25,"Delhi"),
                new Student(2,"C++",22,"Delhi"),
                new Student(3,"Python",21,"Delhi"),
                new Student(4,"Unix",29,"Delhi"),
                new Student(5,"JavaScript",26,"Delhi")
        );

//        students.stream()
//                .filter((s)->s.getAge()>25)
//                .forEach(System.out::println);
//
//        List<Student> listOf25 = students.stream()
//                .filter((student)-> student.getAge()>26)
//                .collect(Collectors.toList());
//        System.out.println(listOf25);

        students.sort(Comparator.comparing(Student::getName));
        students.forEach(System.out::println);
        System.out.println("------------------");
        students.sort(Comparator.comparing(Student::getAge));
        students.forEach(System.out::println);
        System.out.println("------------------");
        students.sort(Comparator.comparing(Student::getCity));
        students.forEach(System.out::println);
        
    }
}

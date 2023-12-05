package com.epam.comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {


        List<Student> students = new ArrayList<>();
        students.add(new Student(10,"shasank","shasank@gmail.com"));
        students.add(new Student(2,"charan","charan@gmail.com"));
        students.add(new Student(12,"hemanth","hemanth@gmail.com"));
        students.add(new Student(5,"vamsi","vamsi@gmail.com"));

        System.out.println("students before sorting");
        students.forEach(System.out::println);

        System.out.println("----------------------------------");
        //sorting done based on Id Comparator
        System.out.println("students after sorting by id");
        Collections.sort(students,new IdComparator());
        students.forEach(System.out::println);

        System.out.println("----------------------------------");
        //sorting done based on Name Comparator
        System.out.println("students after sorting by name");
        Collections.sort(students,new NameComparator());
        students.forEach(System.out::println);

        System.out.println("----------------------------------");
        //sorting done based on Email Comparator
        System.out.println("students after sorting by email");
        Collections.sort(students,new EmailComparator());
        students.forEach(System.out::println);

    }
}

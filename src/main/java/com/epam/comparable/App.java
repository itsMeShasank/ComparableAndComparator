package com.epam.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(10,"shasank","shasank@gmail.com"));
        students.add(new Student(2,"charan","charan@gmail.com"));
        students.add(new Student(12,"hemanth","hemanth@gmail.com"));
        students.add(new Student(5,"vamsi","vamsi@gmail.com"));

        System.out.println("students before sorting");
        students.forEach(System.out::println);

        System.out.println("----------------------------------");
        //sorting done internally compareTo() by Student class,as it was implements Comparable
        System.out.println("students after sorting by id");
        Collections.sort(students);
        students.forEach(System.out::println);

        /*what if, user wants to sort according to name instead of id.
        * we should not need to change existing code,then comparator is useful
        * in this situation.
        * */
    }
}

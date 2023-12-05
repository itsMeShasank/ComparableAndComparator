package com.epam.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {

        return Integer.compare(student1.getName().compareTo(student2.getName()),0);

        /*if(student1.getName().compareTo(student2.getName()) == 0) {
            return 0;
        }else if(student1.getName().compareTo(student2.getName()) > 0) {
            return 1;
        }else {
            return -1;
        }*/
    }
}

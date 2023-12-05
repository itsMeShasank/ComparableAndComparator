package com.epam.comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {

        return Integer.compare(student1.getId().compareTo(student2.getId()),0);

        /*
        if(student1.getId().compareTo(student2.getId()) == 0) {
            return 0;
        }else if(student1.getId().compareTo(student2.getId()) > 0) {
            return 1;
        }else {
            return -1;
        }
        */
    }
}

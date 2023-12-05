package com.epam.comparable;

import java.util.Objects;

public class Student implements Comparable<Student>{

    /*
    basically,Comparable interface is implemented by all wrapper classes by default.
    As Student is one of the Custom class, and it has an ability to implement both comparable
    and comparator interfaces to sorting accordingly. as comparable to achieve single sorting
    technique of student class with id sorting. right now, is just to show how comparable interface
    is applied to this Student class to achieve sorting.

    few important points to remember how Comparable interface is works.
    1. its is from java.lang.
    2. all wrapper classes implements comparable interface.
    3.it has only one method compareTo(T obj) and return int value (Functional Interface).
    4.it is used only when sorting criteria is one,means sorting by single data member only.
    5.it changes Custom class to achieve the sorting technique.
    6.single sorting is suitable.
    7.no flexibility of creating multiple sorting techniques it makes changes to already existing sorting technique.
    */

    private Integer id;
    private String name;
    private String email;

    public Student(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public int compareTo(Student student) {
        if(this.id.intValue() == student.id.intValue()) {
            return 0;
        }else if(this.id > student.id) {
            return 1;
        }else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

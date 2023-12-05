package com.epam.comparator;

import java.util.Objects;

public class Student {

   /*
    As Student is one of the Custom class, and it has an ability to implement both comparable
    and comparator interfaces to sorting accordingly. as comparable to achieve single sorting
    technique of student class with id sorting. right now, is just to show how comparator interface
    is applied to this Student class to achieve sorting by all data members in it.

    few important points to remember how Comparator interface is works.
    1. its is from java.util.
    2.it has only one method compare(T obj1,T obj2) and return int value (Functional Interface).
    4.it is used when multiple sorting techniques are needed.
    5.no change in class structure,created new classes for each sorting techniques.
    6.it has more flexibility that helps when any new data member added and need to have sorting based on that
        we can easily create a new class to achieve that.
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
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

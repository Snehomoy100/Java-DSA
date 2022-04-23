package oops2;

import oops.Student; // for importing functionalities of the class of diff packages

public class Student2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.courseName = "Computer Science";
        System.out.println(s1.courseName);
        int rollNo = s1.getRoll(10);
        System.out.println(rollNo);
    }
}

package com.nizhm.base.abs;

import com.nizhm.base.abs.implement.Student;

public class AbsTest {
    public static void main(String[] args) {
        Student student = new Student("nizhm", "computer science");
        System.out.println(student.getDescription());
    }
}

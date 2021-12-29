package com.nizhm.base.abs.implement;

import com.nizhm.base.abs.Person;

public class Student extends Person {
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return super.getName() + " learns " + this.major + ".";
    }

    @Override
    public String getMajorInfo() {
        return null;
    }
}


package com.nizhm.base.abs;

/**
 * @warning Abstract class can not be instantiated
 * */
public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    /**
     * @description
     *  1.abstract do not need to implement in superclass;
     *  2.subclass must implement all these abstract methods unless abstract subclass;
     * */
    public abstract String getDescription();

    public abstract String getMajorInfo();

    public String getName() {
        return this.name;
    }
}

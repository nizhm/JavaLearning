package com.nizhm.base.overloading;

import java.time.LocalDate;

/**
 * @author nizhm
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee() {
        this.name = "unknown";
        this.salary = 8000;
        this.hireDay = LocalDate.now();
    }

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public LocalDate getHireDay() {
        return this.hireDay;
    }
}

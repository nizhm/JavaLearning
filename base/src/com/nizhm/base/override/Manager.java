package com.nizhm.base.override;

import com.nizhm.base.overloading.Employee;

/**
 * @author nizhm
 */
public class Manager extends Employee {
    private double bonus;

    public Manager(String name) {
        super(name);
        this.bonus = 1500;
    }

    public Manager(String name, double bonus) {
        super(name);
        this.bonus = bonus;
    }

    public Manager(String name, double salary, double bonus, int year, int month, int day) {
        super(name, salary, year, month, day);
        this.bonus = bonus;
    }

    public double getBonus() {
        return this.bonus;
    }

    /**
     * @description override super.getSalary() method
     * @author nizhm
    **/
    @Override
    public double getSalary() {
        return super.getSalary() + this.bonus;
    }
}

package com.nizhm.base.polymorphism;

import com.nizhm.base.overloading.Employee;
import com.nizhm.base.override.Manager;

public class Polymorphism {
    /**
     * @description variable of superclass can be assigned to both self instance and its subclass instance
     * @author nizhm
     * */
    public static void main(String[] args) {
        Employee[] employeeArr = new Employee[2];
        employeeArr[0] = new Employee("nizhm");
        employeeArr[1] = new Manager("admin");
        System.out.println(employeeArr[0].getSalary());
        System.out.println(employeeArr[1].getSalary());
    }
}

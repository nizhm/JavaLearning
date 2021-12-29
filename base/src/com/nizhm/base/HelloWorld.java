package com.nizhm.base;

import com.nizhm.base.overloading.Employee;

/**
 * @author nizhm
 */
public class HelloWorld {
    public static void main(String[] args) {
        Employee employee = new Employee("nizhm");
        System.out.println("Hello world!" + employee.getName());
    }
}

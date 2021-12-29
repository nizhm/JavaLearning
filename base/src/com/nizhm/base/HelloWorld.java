package com.nizhm.base;

import com.nizhm.base.override.Manager;

/**
 * @author nizhm
 */
public class HelloWorld {
    public static void main(String[] args) {
        Manager manager = new Manager("nizhm");
        System.out.println(manager.getSalary());
    }
}

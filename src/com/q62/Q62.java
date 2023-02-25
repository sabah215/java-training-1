package com.q62;

import com.q60.Employee;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Q62 {
    public static void main(String[] args) {
        Employee e = new Employee(101, "John", 1000);
        Employee e1 = new Employee(102, "Sam", 2000);
        Employee e2 = new Employee(103, "Jane", 3000);
        Employee e3 = new Employee(104, "Peter", 4000);
        Employee e4 = new Employee(105, "John", 5000);

        Vector<Employee> v = new Vector<>();
        v.add(e);
        v.add(e1);
        v.add(e2);
        v.add(e3);
        v.add(e4);
        display(v);


    }
    public static void display(Vector<Employee> v){
        Enumeration<Employee> en = v.elements();
        while (en.hasMoreElements()){
            Employee emp = en.nextElement();
            System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary());
        }
    }
}

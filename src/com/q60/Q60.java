package com.q60;

import java.util.ArrayList;

public class Q60 {
    public static void main(String[] args) {
        Employee e = new Employee(101, "John", 1000);
        Employee e1 = new Employee(102, "Sam", 2000);
        Employee e2 = new Employee(103, "Jane", 3000);
        Employee e3 = new Employee(104, "Peter", 4000);
        Employee e4 = new Employee(105, "John", 5000);

        ArrayList<Employee> al = new ArrayList<>();
        al.add(e);
        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);
        display(al);
    }

    public static void display(ArrayList<Employee> arr){
        for(int i=0; i < arr.size(); i++){
            Employee e= arr.get(i);
            System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());
        }
    }
}

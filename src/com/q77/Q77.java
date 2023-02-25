package com.q77;

import com.q60.Employee;

import java.util.ArrayList;
import java.util.Iterator;


public class Q77 {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(101, "sam", 1000));
        al.add(new Employee(102, "sameer", 2000));
        al.add(new Employee(103, "shyam", 3000));
        al.add(new Employee(104, "ram", 4000));
        al.add(new Employee(105, "ramesh", 5000));
        al.add(new Employee(106, "sameera", 60000));

        ArrayList<Integer> ids = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> salaries = new ArrayList<>();

        Iterator<Employee> it = al.iterator();
        while (it.hasNext()){
            Employee emp = it.next();
            ids.add(emp.getId());
            names.add(emp.getName());
            salaries.add(emp.getSalary());
        }
        display(ids);
        System.out.println();
        displayNames(names);
        System.out.println();
        display(salaries);
    }

    public static void display(ArrayList<Integer> list){
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+ " ");
        }
    }
    public static void displayNames(ArrayList<String> list){
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+ " ");
        }
    }
}

package com.q78;

import com.q60.Employee;

import java.util.ArrayList;
import java.util.Iterator;

public class Q78 {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(101, "sam", 10000));
        al.add(new Employee(102, "sameer", 2000));
        al.add(new Employee(103, "shyam", 30000));
        al.add(new Employee(104, "ram", 4000));
        al.add(new Employee(105, "ramesh", 15000));
        al.add(new Employee(106, "sameera", 60000));

        ArrayList<Integer> salaries = new ArrayList<>();

        Iterator<Employee> it = al.iterator();

        while (it.hasNext()){
            int salary = it.next().getSalary();
            if(salary > 5000)
                salaries.add(salary);
        }
        display(salaries);
    }

    public static void display(ArrayList<Integer> list){
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+ " ");
        }
    }
}

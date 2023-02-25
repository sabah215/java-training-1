package com.q76;

import com.q60.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Q76 {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(101, "sam", 1000));
        al.add(new Employee(102, "sameer", 2000));
        al.add(new Employee(103, "shyam", 3000));
        al.add(new Employee(104, "ram", 4000));
        al.add(new Employee(105, "ramesh", 5000));
        al.add(new Employee(106, "sameera", 60000));

        ArrayList<Integer> idList = new ArrayList<>();
        ListIterator<Employee> li = al.listIterator();

        while (li.hasNext()){
            int id = li.next().getId();
            idList.add(id);
        }

        display(idList);
    }

    public static void display(ArrayList<Integer> list){
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

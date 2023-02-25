package com.q74;

import com.q60.Employee;

import java.util.*;


public class Q74 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(7);
        arr.add(5);
        arr.add(16);
        arr.add(7);
        arr.add(16);

        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(100);
        arr1.add(7);
        arr1.add(5);
        arr1.add(56);
        arr1.add(17);
        arr1.add(26);

//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        list.add(arr);
//        list.add(arr1);
        ArrayList<Integer> list = new ArrayList<>();
        Iterator<Integer> it = arr.iterator();
        while(it.hasNext()){
            list.add(it.next());
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        Iterator<Integer> it1 = arr1.iterator();
        while(it1.hasNext()){
            list1.add(it1.next());
        }
        display(list);
        System.out.println();
        display(list1);

    }

    public static void display(ArrayList<Integer> list){
        Enumeration<Integer> en = Collections.enumeration(list);
        while (en.hasMoreElements()){
            int in  = (Integer) en.nextElement();
            System.out.print(in + " ");

        }
    }
}

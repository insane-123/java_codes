package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class link_list {
    public static void main(String[] args) {
    LinkedList<Integer> l1 =new LinkedList<>();
    LinkedList<Integer> l2 =new LinkedList<>();
    l2.add(21);
    l2.add(34);
    l2.add(33);
    l2.add(13);
    l2.add(29);
    l1.add(5);
    l1.add(7);
    l1.add(13);
    l1.addLast(20);
    l1.addFirst(5);
    l1.add(0,9);
    l1.add(2,4);
    l1.addAll(0,l2);
    l1.set(1,13);
    for(int i=0;i<l1.size();i++){
        System.out.print(l1.get(i));
        System.out.print(", ");
    }
    System.out.println();
    System.out.println(l1.contains(4));
    System.out.println(l1.indexOf(13));
    System.out.println(l1.lastIndexOf(13));


}
}

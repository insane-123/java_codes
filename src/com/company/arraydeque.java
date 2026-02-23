package com.company;

import java.util.ArrayDeque;

public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> l1 = new ArrayDeque<>();
        l1.add(2);
        l1.add(12);
        l1.add(9);
        l1.addFirst(23);
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
        System.out.println(l1);
    }
}

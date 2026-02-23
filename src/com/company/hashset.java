package com.company;

import java.util.*;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> m1=new HashSet<>(5,.01f);
        m1.add(12);
        m1.add(41);
        m1.add(3);
        m1.add(23);
        m1.add(11);
        System.out.println(m1);
        System.out.println(m1.contains(3));
        //learn from java oracle....
    }
}

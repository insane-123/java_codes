package com.company;
import java .util.*;
public class date_method {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        Date d =new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getYear());
        System.out.println(d.getSeconds());
        System.out.println(d.getMinutes());
        System.out.println(d.getMonth());
        System.out.println(d.getHours());

    }
}

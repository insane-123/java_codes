package com.company;

import java.util.Scanner;

public class nested_trycatchloop {
    public static void main(String[] args) {
        boolean a=true;
        int[] a1 = new int[3];
        a1[0] = 30;
        a1[1] = 10;
        a1[2] = 23;
        Scanner sc = new Scanner(System.in);
        while ( a ) {

            try {
                System.out.println("code is working....");
                int ind = sc.nextInt();
                try {
                    System.out.println("it is here");
                    System.out.println(a1[ind]);
                    a=false;

                } catch (Exception e) {
                    System.out.println(e);
                    System.out.println("exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("exception is on level one");
            }
        }


    }
}
package com.company;

import java.util.Scanner;

public class gcd {
    static void printgcd(int a, int b) {
        int m = 1;
        for (int i = 1; i <= a && i <= b; i++) {
          if(a%i==0&&b%i==0){
              m=i;
          }

        }
        System.out.println(m);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number : ");
       int m=sc.nextInt();
        System.out.println("enter your second number :");
       int n = sc.nextInt();
        System.out.println("gcd of your given number :");
        printgcd(m,n);
        }
    }


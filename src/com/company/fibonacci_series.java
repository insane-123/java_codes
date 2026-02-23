package com.company;
import java.util.*;
public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of fibonacci series: ");
        int n=sc.nextInt();
        int n1=0;
        int n2=1;
        int c=n1+n2;
        System.out.print(n1+" ");
        System.out.print(n2+" ");
        System.out.println("fibonacci series: ");
//        System.out.print("0"+" ");
//        System.out.print("1"+" ");
        for(int i=2;i<n;i++){

            System.out.print(n1+" ");
            n1=n2;
            n2=c;
            c=n1+n2;
        }

    }
}

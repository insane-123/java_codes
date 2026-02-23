package com.company;
import java.util.Scanner;
public class chapter7_practice_set {
//    static void mul(int a){
//for(int i=1;i<=10;i++) {
//    System.out.printf("%d*%d=%d", a, i, a * i);
//    System.out.println("");
//}
//}
//    public static void main(String[] args) {
//        //question no 1
//        System.out.println("enter the table no: ");
//        Scanner sc=new Scanner(System.in);
//        int x =sc.nextInt();
//        System.out.println("your table is: ");
//        mul(x);
//    }
    //question 2,4
//    static void pattern_print1(int n1) {
//        for (int i = n1; i >= 1; i--) {
//            for (int j = i; j <= n1; j++) {
//                System.out.print("* " + "");
//            }
//            System.out.println("");
//        }
//    }
//        static void pattern_print2(int n2){
//            for(int i=1;i<=n2;i++){
//                for(int j=i;j<=n2;j++){
//                    System.out.print("* "+"");
//                }
//                System.out.println("");
//            }
//    }
//public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    System.out.println("enter the range");
//    int x= sc.nextInt();
//    System.out.println("first pattern: ");
//    pattern_print1(x);
//    System.out.println("2nd pattern: ");
//    pattern_print2(x);
//}
    //qs no.3
//    static void oddsum(int x){
//        System.out.println("all odd numbers in your input: ");
//        int m=1;
//        int n=0;
//        for(int i=0;i<x/2;i++){
//            m=2*i+1;
//            n=n+m;
//            System.out.println(m);
//        }
//        System.out.println("sum of odd numbers: ");
//        System.out.println(n);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your range");
//        int a=sc.nextInt();
//
//        oddsum(a);
//    }
//qs no 9: celcius to fahrenheit
    static void cel_to_fun(double c){
        double a =1.8;
       double f=a*c+32;
        System.out.println(f);
    }

    public static void main(String[] args) {
        System.out.println("enter the celcius value : ");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("farenhiet value: ");
        cel_to_fun(x);
    }
}

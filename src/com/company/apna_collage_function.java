package com.company;

import java .util.Scanner;
//import java.lang.Math;
public class apna_collage_function {
    //question no 1
//    static float average(int x, int y, int z) {
//        float av;
//        av = (x + y + z) / 3;
//        System.out.println(av);
//        return av;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter first number : ");
//        int a = sc.nextInt();
//        System.out.println("enter second number : ");
//        int b = sc.nextInt();
//        System.out.println("enter 3rd number : ");
//        int c = sc.nextInt();
//        System.out.println("average value : ");
//        average(a,b,c);
//    }
    //question no 2
//    static void sum_of_odd(int n){
//        int c=1;
//        int d=0;
//        for(int i=0;i<n;i++){
//            c=2*i+1;
//            d=c+d;
//        }
//        System.out.println(d);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//
//        System.out.println("enter the limit : ");
//        int m =sc.nextInt();
//        System.out.printf("summation of %d odd numbers are\n",m);
//        sum_of_odd(m);
//    }
    // question no 3
//    static void greatest_value(int a, int b) {
//        if (a < b) {
//            System.out.println(b);
//        }
//        else {
//            System.out.println(a);
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner (System.in);
//        int x = sc.nextInt();
//        int y =sc.nextInt();
//        System.out.println("biggest number : ");
//        greatest_value(x,y);
    // }
// question 7
//    public static void main(String[] args) {
//        int neg=0;
//        int pos=0;
//        int zero=0;
//        Scanner sc = new Scanner (System.in);
//        System.out.println("enter the limit : ");
//        int n =sc.nextInt();
//        int [ ] arr =new int [n];
//        System.out.println("enter the elemennts : ");
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        for(int i=0;i<n;i++){
//            if(arr[i]<0){
//                neg=neg+1;
//            }
//            else if (arr[i]>0){
//                pos=pos+1;
//            }
//            else if(arr[i]==0){
//                zero=zero+1;
//            }
//        }
//        System.out.println("total negetive numbers: ");
//        System.out.println(neg);
//        System.out.println("total positive numbers: ");
//        System.out.println(pos );
//        System.out.println("total zero  numbers: ");
//        System.out.println(zero);
//    }
    //question 4
    static void circumference(double n ){
       double m;
       double x=3.14;
        m=2*x*n;
        System.out.println(m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Radios: ");
        double r = sc.nextFloat();
        circumference(r);
    }
    //question 8
//    static void power(int a, int b){
//        System.out.println(Math.pow(a,b));
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number:");
//        int m=sc.nextInt();
//        System.out.println("enter the power: ");
//        int n=sc.nextInt();
//        System.out.println("result: ");
//        power(m,n);
//    }
    //qs 8 alternative process
//    static void power(int a, int b){
//        int m=1;
//        for(int i=0;i<b;i++){
//           m=m*a;
//        }
//        System.out.println(m);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.println("enter the number : ");
//        int x=sc.nextInt();
//        System.out.println("enter the power: ");
//        int y =sc.nextInt();
//        System.out.println("result: ");
//        power(x,y);
//qs no : 9
//static void gcd (int a,int b ){
//    int m=1;
//    for(int i =1;i<=a&&i<=b;i++){
//        if(a%i==0&&b%i==0){
//        m=i;
//        }
//    }
//    System.out.println(m);
//}
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the first number : ");
//        int x = sc.nextInt();
//        System.out.println("enter the second number : ");
//        int y = sc.nextInt();
//        System.out.println("gcd value of two given numbers:  ");
//        gcd(x, y);
//    }
    //alternative approach(wrong)

//    static void gcd(int a, int b) {
//        int m = 1;
//        if (a < b) {
//            for (int i = 1; i <= a; i++) {
//                if (a % i == 0) {
//                    m = i;
//                }
//            }
//            System.out.println(m);
//        }
//        else {
//            for (int i = 1; i <= b; i++) {
//                if (b % i == 0) {
//                    m = i;
//                }
//            }
//            System.out.println(m);
//        }
//    }
    //qs no 10
//static void fibonacci(int a){
//    int n1=0;
//    int n2=1;
//    int n3;
//    if(a==1){
//        System.out.println("fibonacci number: ");
//        System.out.println(n1);
//    }
//    else if (a==2) {
//        System.out.println("fibonacci numbers: ");
//        System.out.println(n1+"\n"+n2);
//    }
//    else {
//        System.out.println("fibonacci numbers: ");
//        System.out.println(n1+"\n"+n2);
//        for (int i = 2; i < a; i++) {
//            n3 = n1 + n2;
//            n1 = n2;
//            n2 = n3;
//            System.out.println(n3);
//        }
//    }
//
//}
//
//
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner (System.in);
//        System.out.println("enter the limit of fibonacci numbers: ");
//        int b = sc.nextInt();
//        fibonacci(b);
//    }
}
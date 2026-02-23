package com.company;
import java.util.Scanner;
public class chap1_exe1 {
    public static void main(String[] args){
        System.out.println("enter numbers : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number : ");
        int a=sc.nextInt();
        System.out.println("enter second number : ");
        int b= sc.nextInt();
        System.out.println("enter third number : ");
        int c= sc.nextInt();
        int s= a+b+c;
        System.out.print("sum of your numbers: ");
        System.out.println(s);
    }
}

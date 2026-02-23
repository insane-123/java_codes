package com.company;
import java.util.Scanner;

public class taking_input {
    public static void main(String[] args){
        System.out.println("taking input from user : ");
        Scanner sc =new Scanner(System.in);
        //System.out.println("enter the input no 1:  ");
        //int a = sc.nextInt();
       // Boolean b1 =sc.hasNextInt();
       // System.out.println(b1);
        //float a=sc.nextFloat();
        // System.out.println("enter the input no 2: ");
       // Float b=sc.nextFloat();
       // Float c=a+b;
       // System.out.println("sum value is :");
       // System.out.println(c);
        String s = sc.nextLine();
        System.out.println(s);
    }
}
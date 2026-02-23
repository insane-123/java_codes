package com.company;
import java.util.Scanner;
public class print_percentage {
    public static void main(String[] args){
        System.out. println("enter your marks : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("subject a=");
        int a= sc.nextInt();
        System.out.println("subject b=");
        int b= sc.nextInt();
        System.out.println("subject c=");
        int c= sc.nextInt();
        System.out.println("subject d=");
        int d= sc.nextInt();
        System.out.println("subject e=");
        int e= sc.nextInt();
        int sum = a+b+c+d+e;
        System.out.print("sum of all marks out of 500 = ");
        System.out.println(sum);
        double p1= sum*100/500;
        System.out.print("percentage of your marks is : ");
        System.out.println(p1);
    }
}

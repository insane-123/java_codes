package com.company;
import java.util.Scanner;
public class methods_recursion {
    //fibonacci series = 0,1,1,2,3,5,8,13....[here we can see first two digit is 0,1 and after that all numbers is a summation of previous two digit
    static void fibonacci(int a){
        int n1=0;
        int n2=1;
        int n3;
        if(a==1){
            System.out.println("fibonacci number: ");
            System.out.println(n1);
        }
         else if (a==2) {
            System.out.println("fibonacci numbers: ");
            System.out.println(n1+"\n"+n2);
        }
         else {
            System.out.println("fibonacci numbers: ");
            System.out.println(n1+"\n"+n2);
            for (int i = 2; i < a; i++) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                System.out.println(n3);
            }
        }

    }



    public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
        System.out.println("enter the limit of fibonacci numbers: ");
int b = sc.nextInt();
fibonacci(b);
    }

}

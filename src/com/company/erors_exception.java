package com.company;


import java.util.Scanner;

public class erors_exception {
    public static void main(String[] args) {


        //syntex error
        int a;
        a = 10;
       // System.out.println(a);
        //a=10//->in above programme if I am not put a semicolon in integer 'a' then it shows an error
        //LOGICAL ERROR->
        // write a code to print all prime number :-
        System.out.println("2");
        for(int i=1;i<5;i++){
            int n=0;
            n=(2*i+1);
            System.out.println(n);
        }
        //up above is a example of logical eroor.. it is hard to find ...
        //RUN TIME ERROR
        Scanner sc =new Scanner(System.in);
        System.out.println("divide 1000 by any number you want: ");
        System.out.println("enter a number ");
        int k =sc.nextInt();
        System.out.println("result is:  ");
        System.out.println(1000/k);
    }
}
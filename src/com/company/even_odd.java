package com.company;
import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
        int a;
        Scanner sc= new Scanner(System.in);

        System.out.println("enter your number: ");
        a=sc.nextInt();
        if(a%2==0){
            System.out.println("your given number "+ a +" is even");
        }
        else {
            System.out.println("your given number " + a + " is odd number");
        }
    }
}

package com.company;

import java.util.Scanner;

public class exception_handle {
    public static void main(String[] args) {
        int[] ar = new int[10];
        ar[0] = 20;
        ar[1] = 34;
        ar[2] = 22;
        ar[3] = 10;
        int ind;
        int d;
        try {


            Scanner sc = new Scanner(System.in);
            System.out.println("enter a array digit: ");
            ind = sc.nextInt();
            System.out.println("your array is: " + ar[ind]);
            System.out.println("enter the you want to divide: ");
            d = sc.nextInt();
            System.out.println("after divide result : " + ar[ind] / d);
        }
        catch(ArithmeticException e){
            System.out.println("arithmatic error occur ");
            System.out.println(e);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("index out of bounds error");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("other exception occur");
            System.out.println(e);

        }
    }
}

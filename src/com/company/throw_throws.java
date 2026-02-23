package com.company;

import java.util.Scanner;


public class throw_throws {
    public static double area()throws NegativeArraySizeException{

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the radius: ");
        int r=sc.nextInt();
        if(r<0){
            throw new NegativeArraySizeException();
        }
        System.out.println("area of a circle: ");
        double ar = Math.PI *r*r;
        return ar;

    }
    public static void main(String[] args) {
        try {
            System.out.println(area());
        }
        catch (Exception e){
            System.out.println("there is a exception occur");
            System.out.println(e);
        }

    }
}

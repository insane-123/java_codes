package com.company;
import java .util.Scanner;

public class calculator {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number ");

      int a =sc.nextInt();
        System.out.println("enter ur second number ");
      int b =sc.nextInt();
        System.out.println("enter the operation u want to create: ");
        String var=sc.next();
      switch(var){
          case "+":
              int c=a+b;
              System.out.printf("%d+%d=%d",a,b,c);
              break;
          case "-":
              int d=a-b;
              System.out.printf("%d-%d=%d",a,b,d);
              break;
          default:
              System.out.println("wrong input");
      }
    }
}

package com.company;
import java.util.Scanner;
public class chapter_5_practiceset {
    // question no 1
    public static void main(String[] args) {
       // int i;
       // int j;
      // for (i = 4; i >= 1; i--) {
        //    for (j = 1; j <= i; j++) {
          //      System.out.print("*");
            //}
          // System.out.print("\n");
        //}
    //}
    // question 2
    /*Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of even numbers you want to print: ");
    int n=sc.nextInt();
    int i=1;
    int sum =0;
        System.out.println("sum of even numbers: ");
    while(i<=n){
        sum = sum +(2*i);
        i++;
        }
        System.out.println(sum); */
        // quiestion 3
       /* Scanner sc = new Scanner (System.in);
        System.out.println("enter the number of multiplication table u want to search : ");
        int n= sc.nextInt();
        int i=10;
        int mul=1;
        while(i>=1){
            mul=i*n;
            System.out.printf("%d x %d = %d",n,i,mul);
           System.out.print("\n");
            i--;
        }*/
//question 5
       /* Scanner sc = new Scanner (System.in);
        System.out.println("enter the fact number ");
        int n= sc.nextInt();
        int fact=1;
        int i=1;
        while(i<=n){
            fact=fact*i;
            i++;
        }
        System.out.println("factorial value is : ");
        System.out.println(fact);*/

//question 8
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the table u want to print : ");
        int n= sc.nextInt();
        int j=10;
        int i=1;
        int mul =1;
        int sum =0;
        while(i<=j){
           mul = n*i;
           sum= sum+mul;
            System.out.printf("%d x %d = %d, sum = %d",n,i,mul,sum);
            System.out.println("\n");
            i++;
        }
    }

}
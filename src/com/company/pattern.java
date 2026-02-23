package com.company;
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        /*int rows = 5;
        System.out.println(" Printing the pattern ");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= rows - 1; i++)
        {
            for (int j = rows - 1; j >= i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/
        //pattern 1:
       /* Scanner sc=new Scanner (System.in);
        System.out.println("enter the range: ");
        int n=sc.nextInt();
        int j;

        for(int i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }*/
        //problem 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range: ");
        int n = sc.nextInt();
        int j;

        for (int i = 1; i <= n; i++) {
            for (j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}

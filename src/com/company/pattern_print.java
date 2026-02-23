package com.company;
import java .util.Scanner;
public class pattern_print {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("  enter number :- ");
        int rows = sc.nextInt();
        System.out.println("Printing the pattern:- ");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }

}
}
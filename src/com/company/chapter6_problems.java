package com.company;
import java.util.Scanner;
public class chapter6_problems {
    public static void main(String[] args) {
        System.out.println("enter the number of rows : ");
        Scanner sc= new Scanner(System.in);
        int ro=sc.nextInt();
        System.out.println("enter the number of columns: ");
        int col =sc.nextInt();
        int [] [] mat1=new int[ro][col];
        int[] [] mat2=new int [ro][col];
        System.out.println("1st matrix: ");
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                mat1[i][j]= sc.nextInt();
            }
        }
        System.out.println("2nd matrix: ");
        for(int i=0;i<mat2.length;i++){
            for(int j=0;j<mat2[i].length;j++){
                mat2[i][j]= sc.nextInt();
            }
        }
    int [][] result=new int [ro][col];
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                result[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(result [i][j]+" ");
            }
            System.out.println("");
        }
    }
}

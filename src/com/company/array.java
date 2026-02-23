package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
    int [] a={45,34,56,78};
        System.out.println(a.length);
        System.out.println(a[2]);
        float [] b={45.45F,34.33F,56.4f,78.55f};
        System.out.println(b[2]);
        int [] a1=new int[10];
        System.out.println("enter 10 elements of array:");
for(int i=0;i<5;i++){
    Scanner sc= new Scanner(System.in);
    a1[i]= sc.nextInt() ;
}
        System.out.println("all element of array a1 is :");
for(int i=0;i<5;i++){

    System.out.print(a1[i]);
    System.out.print("\t");
}
        //System.out.println(Arrays.toString(a1));

    }

}

package com.company;

import java.util.Scanner;

public class smallest_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.println("enter the array size: ");
        int size=0;
if (sc.hasNextInt()){
    size= sc.nextInt();
}
        System.out.println("Enter the elements of array: ");
int [] arr = new int[size];
for(int i=0;i<size;i++){
    if(sc.hasNextInt()){
        arr[i] =sc.nextInt();
    }

    }
        System.out.println("array is : ");
        for(int i1=0; i1<size;i1++){
            System.out.print(arr[i1]+ " ");
}
        int min = arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min= arr[i];
            }
        }
        System.out.println();
        System.out.println( "smallest element in array is :  ");
        System.out.print(min);
    }
}

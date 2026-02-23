package com.company;

public class multidimensional_array {
    public static void main(String[] args) {
        int [][] flat;
        flat= new int [2] [3];
        flat[0][0]=100;
        flat[0][1]=101;
        flat[0][2]=102;
        flat[1][0]=103;
        flat[1][1]=104;
        flat[1][2]=105;
        for (int[] ints : flat) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println("");
        }

    }
}

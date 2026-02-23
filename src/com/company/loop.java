package com.company;

public class     loop {
    public static void main(String[] args) {
        /*
        // while loop :-
        int i= 1;
        while(i<=100){
            System.out.println(2*i+1);
            i++;*/
        // do while loop  :-
        //print of n natural number
        // int b=1;
        //do{
        //  System.out.println(b);
        //b++;
        // }
        // while(b<45);
        //for loop  :-
        //for(int i=50;i>1;i--){
        //  System.out.println(i);
        //}
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print('*');
            }
        }
    }
}

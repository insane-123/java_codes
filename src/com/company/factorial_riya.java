package com.company;

public class factorial_riya {

        public static int fact(int value){
            int fact;

            fact=value*fact(value-1);


            return fact;
        }
        public static void main(String[]args){
            System.out.println(fact(5));


        }
    }


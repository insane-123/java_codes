package com.company;

public class try_catch_method {
    public static void main(String[] args) {
        int a=5000;
        int b=0;
        try {
            System.out.println(a/b);
        }
        catch (Exception e){
            System.out.println("error cause is: ");
            System.out.println(e);
        }
    }
}

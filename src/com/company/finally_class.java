package com.company;

public class finally_class {
    public static void main(String[] args) {
        int a = 5;
        int b = 23;
        for (int i = 0; i < 1;i--) {
            try {
                System.out.println("divide result: ");
                System.out.println(b / a);
            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("now value of b is: " + a);
                a=a-1;
            }
        }
    }


}

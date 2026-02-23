package com.company;

public class break_continue {
    public static void main(String[] args) {
        int i;
        for (i=0;i<=10;i++) {
            if (i == 3) {
                System.out.println("great view");
                continue;
            }
            System.out.println(i);
        }
        int j;
        for (j=0;j<=10;j++){
            if (j==3){
                System.out.println("great view");
                break;
            }
            System.out.println(j);
        }


    }
}



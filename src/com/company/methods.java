package com.company;

public class methods {
    static int sum(int x,int y){
        int z;
        if(x>y){
            z=x-y;
        }
        else{
            z=x+y;
        }
        return z;
    }
    public static void main(String[] args) {
int a=7;
int b=4;
int c=sum(a,b);
        System.out.printf("value of c= %d\n",c);
        int a1=4;
        int b1=5;
        int c1=sum(a1,b1);
        System.out.printf("value of c1 is : %d",c1);
    }
}

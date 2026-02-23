package com.company;
class base1{
    int length;
    int breadth;
    public base1(){
        System.out.println("i am a constructor");
    }
    public void printLength(){
        length=4;
        breadth=5;
    System.out.println("length is : "+length);
        System.out.println("breadth is: "+breadth);
    }
    public void printLength(int x){

        System.out.println("length is: "+x);
    }
    public void printLength(int x,int y){


        System.out.println("length is: "+x);
        System.out.println("breadth is: "+y);
    }


}
public class constructor_overloading {
    public static void main(String[] args) {
        base1 b=new base1();
        b.printLength();
    }
}

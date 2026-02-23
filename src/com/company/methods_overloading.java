package com.company;
class methods1{
    int x;
     methods1(){
        System.out.println("i am a method constructor");
  }
    methods1(int b){
        System.out.println("i am"+b+"th constructor");
    }
    public void selfie(){
        System.out.println("taking selfie");
    }
    public void selfie(int a){
        System.out.println("taking selfie"+ a+"th time");
    }
}
class methods2 extends methods1{
    methods2(){
        super (2);
        System.out.println("my name is method 2");
    }

    @Override
 public void selfie(){

     System.out.println("its not working now");
 }
        }

public class methods_overloading {
    static void arg(){
        System.out.println("happy birthday");
    }
    static void arg(int a){
        System.out.println("happy birthday"+a+"friends");
    }
    static void arg(int a,int b){
        System.out.print("happy birthday"+" "+a+" friends"+" remaining: "+b);
    }

    public static void main(String[] args) {
//arg();
//arg(50);
//arg(30,40);
methods2 s2=new methods2();
s2.selfie();
    }
}

package com.company;
import java.util.*;
 class base{
    //int z;
    base(){
        System.out.println("i am a constructor");
    }
    base(int y){
        System.out.printf("my age is : %d\n",y);
    }
    base(int x,int y){

        System.out.println("i love sayan from: "+x+"\nnow it is:"+y);
    }
    public void print(){
        System.out.println("i am a base class method");
    }
}
class derived1 extends base{
    derived1(){

        System.out.println("riya is my love");
    }
    derived1(int x){
       super(2022,2023);
        System.out.printf("her age is : %d",x);
    }
    derived1 (String x, String y ){
        super(34,56);
        System.out.println("her eyes are: \t"+x+" \nher hair smells :\t"+y);
    }
    public void printName(){
        System.out.println("and she also loved me ");
    }
}
public class constructor_in_inheritance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
derived1 riya =new derived1(m);
riya.print();
//riya.printname();


    }
}

package com.company;
class A{
    public void printName(){
        System.out.println("riya khatua");
    }
}
class B extends A{
    @Override
    public void printName(){
        System.out.println("sayan maity");
    }
}
public class overiding_riya {
    public static void main(String[] args) {
        B b=new B();
        b.printName();
        A a=new A();
        a.printName();
    }
}

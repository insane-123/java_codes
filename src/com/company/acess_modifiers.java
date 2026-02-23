package com.company;

class a1{
    int x =4;
    public int  v =23;
    private int t=12;
    protected int r=34;
    public void meth1 (){
        System.out.println(x);
        System.out.println(v);
        System.out.println(t);
        System.out.println(r);
    }
}
public class acess_modifiers {
    public static void main(String[] args) {
        a1 sara = new a1();
        System.out.println(sara.r);
        System.out.println(sara.x);
        // System.out.println(sara.t);//-> throws error cause its is a private file it is not accessible in same package ;
        System.out.println(sara.v);
        System.out.println("printing all values using methods: ");
        sara.meth1();
    }
}
package com.company;
class dynamic {
    public void method1() {
        System.out.println("riya is a good girl");
    }
    public void method2() {
        System.out.println("sayan is a good boy");
    }
}
    class dynamic1 extends dynamic{
        public void method1() {
            System.out.println("riya is a naughty girl");
        }
        public void method2(){
            System.out.println("i love you pocha");
        }
        public void method3(){
            System.out.println("pochaaaaaaaaaaa");
        }
    }
public class dynamic_methode_dispatch_riya {
    public static void main(String[] args) {
        //dynamic1 b=new dynamic();(not allowed)
   dynamic a= new dynamic1();
//        a.method1();
        //a.method3(); not allowed
        a.method2();
        a.method1();
       // a.method3();
    }
}

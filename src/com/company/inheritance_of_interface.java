package com.company;
interface parents{
    void meth1();
    void meth2();
}
interface child extends parents{
    void meth3();
    void meth4();
}
class family implements child{
    public void meth1(){
        System.out.println("fathers name is Sadhunath Maity");
    }
    public void meth2(){
        System.out.println("mothers name is tanushree maity");
    }
    public void meth3(){
        System.out.println("child 1 name santanu maity");
    }
    public void meth4(){
        System.out.println("child 2 name is sayan maity");
    }
}
public class inheritance_of_interface {
    public static void main(String[] args) {
     family myfam =new family();
     myfam.meth3();
    }
}

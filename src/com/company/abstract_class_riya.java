package com.company;

 abstract class phone1{
     public phone1(){

         System.out.println("call is available");
     }

     abstract public void whatsapp();
     abstract public void facebook();
     abstract public void instagram();

}
 class smartphone1 extends phone1{
     public void whatsapp(){

         System.out.println("whatsapp is available......");
     }
     public void facebook(){

         System.out.println("facebook is available....");
     }
     public void instagram(){
         System.out.println("instagram is available....");
     }
}
abstract class smartphone2 extends phone1{
//     public void instagram(){
//
//         System.out.println("instagram is available.... ");
//     }

}
class cellphone extends smartphone2{
    public void whatsapp(){

        System.out.println("whatsapp is available......");
    }
    public void facebook(){

        System.out.println("facebook is available....");
    }
    public void instagram(){

        System.out.println("instagram is available....*");
    }
}
public class abstract_class_riya {
    public static void main(String[] args) {
//smartphone1 s=new smartphone1();
        smartphone2 s =new cellphone();


s.whatsapp();
s.facebook();
s.instagram();

//phone1 p=new phone1();-- not allowed because of abstract class
       // smartphone2 sm=new smartphone2();---not allowed because of abstract class
    }
}

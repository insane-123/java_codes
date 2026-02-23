package com.company;

import java.util.Scanner;

class myexception extends Exception{
    public String toString(){
        return "i am toString ";
    }
    public String getMessage() {
        return "i am get massage";
    }
}
public class exception_class {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
       // myexception b= new myexception();
        if(a<9){
            try {
               // throw new myexception();
                throw new ArithmeticException("this is a exception");
            }
            catch(Exception e){
             System.out.println(e.getMessage());
              System.out.println(e.toString());
              e.printStackTrace();
            }

        }
    }
}

package com.company;
class mythreadrunnable1 implements Runnable{
    public void run() {        //=>this method must call, or it throws an error
        int i = 0;
        while (i < 400) {
            System.out.println("i am running runnable interface in method no => 1....");
            i++;
        }
    }
}
class mythreadrunnable2 implements Runnable{
    public void run(){          //=>this method must call, or it throws an error
       int i=0;
       while(i<400) {
           System.out.println("i am running runnable interface in method no => 2....");
           i++;
       }
    }
}
public class thread_runnable {
    public static void main(String[] args) {
        mythreadrunnable1 bullet1 = new mythreadrunnable1();
        Thread gun1= new Thread(bullet1);
        mythreadrunnable2 bullet2= new mythreadrunnable2();
        Thread gun2=new Thread(bullet2);
       // gun1.start();
       // gun2.start();
        System.out.println(gun1.getId());

    }
}

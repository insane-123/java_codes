package com.company;
class mythread4 extends Thread {
    public void run() {
        int i = 0;
        while (i < 200) {
            System.out.println("hello sayan...");
            i++;
        }
    }
}
class interuption_Thread extends Thread{
    public void run(){
        int i=0;
        while(i<20){

            try{
                System.out.println("child thread");
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println("child Thread is interrupted");
            }
           // System.out.println("thread is running....");
            i++;
        }
    }
}
class mythread5 extends Thread {

//    public void run() {
//        int i = 0;
//        while (i < 200) {
//            System.out.println("happy sayan...12");
//            try {
//                Thread.sleep(200);
//
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//            i++;
//        }
//    }
}
public class Thread_methods {
    public static void main(String[] args) {
       mythread4 n1=new mythread4();
       mythread5 n2=new mythread5();
//       n1.start();
//       try {
//
//           n1.join();
//       }
//       catch(Exception e){
//           System.out.println(e);
//       }
//       n2.start();
        interuption_Thread m1 =new interuption_Thread();
        m1.start();
        m1.interrupt();

        System.out.println("code is runnig...");

    }
}

package com.company;
class mythread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 200) {
            System.out.println("i am playing game");
            i++;
        }
    }
}
class mythread1 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i < 200) {
            System.out.println("i am taking with riya");
            i++;
        }
    }
}

public class thread_1 {
    public static void main(String[] args) {
mythread w1 =new mythread();
mythread1 w= new mythread1();
w1.start();
w.start();
    }
}

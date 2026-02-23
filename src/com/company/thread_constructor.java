package com.company;
class construc extends Thread implements Runnable{
    construc( String name){
    super(name);

    }
    public void run(){
        System.out.println("pogramme is running...");
    }
}
class construc1 implements Runnable{
    @Override
    public void run() {
        System.out.println("it is a runnable interface....");
    }

}

public class thread_constructor {
    public static void main(String[] args) {

construc t1=new construc("raju");
construc t2=new construc("love");
construc1 t3 = new construc1();
Thread r1= new Thread(t3);
r1.start();
t1.start();
        System.out.println(t1.getName());
        System.out.println("id of this Thread: "+ t1.getId());
        System.out.println(t2.getName());
        System.out.println("id of this Thread: "+ t2.getId());

    }
}

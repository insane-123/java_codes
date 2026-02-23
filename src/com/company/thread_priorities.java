package com.company;
class mythread2 extends Thread {
    public mythread2(String name) {
        super(name);
        System.out.println("i am a my thread constructor");
    }

            public void run () {
                int i = 0;
                while(i<400)

                {

                    System.out.println("now its running : " + this.getName());
                    i++;
    }
    }
}
public class thread_priorities {
    public static void main(String[] args) {

 mythread2 q1 =new mythread2("sayan1 max priorities");
        q1.setPriority(Thread.MAX_PRIORITY);
 mythread2 q2 =new mythread2("sayan2");
 mythread2 q3 =new mythread2("sayan3");
 mythread2 q4 =new mythread2("sayan4");
 mythread2 q5 =new mythread2("sayan5");
 q2.setPriority(Thread.MIN_PRIORITY);
 q3.setPriority(Thread.NORM_PRIORITY);
 q4.setPriority(Thread.MIN_PRIORITY);
 q5.setPriority(Thread.MIN_PRIORITY);


        q1. start();
        q2. start();
        q3. start();
        q4. start();
        q5. start();
    }
}

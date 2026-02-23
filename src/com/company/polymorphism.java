package com.company;
interface camera1{
    void takesnap();
    void takevideo();
    private void greet()
    {
        System.out.println("hello....");

    }
    default void take4kvedio(){
        greet();
        System.out.println("taking 4k video");
    }
}
interface wifi1{
    String[] networks();
    void connect_network(String networks );
}
class mycellphone2{
    void callnumber(int phno)
    {
        System.out.println("connecting"+ phno);

    }
    void phonecall(){
        System.out.println("connecting...");
    }
}
class mysmartphone1 extends mycellphone2 implements wifi1,camera1{
    public void takesnap(){
        System.out.println("taking snap....");
    }
    public void takevideo(){
        System.out.println("taking vedio...");
    }


    public String[] networks() {
        String [] a={ "aitel","jio5g","asish voda"};
        //       System.out.println("all networks..");
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
        System.out.println("all networks..");
        for (String elments:a){
            System.out.println(elments);
        }
        return a;
    }
    public void connect_network(String networks ){

        System.out.println("connecting network to ..." + networks);
    }
    public void take4kvedio(){
        System.out.println("taking snap and 4k vedio");
    }
}
public class polymorphism{
    public static void main(String[] args) {
        mysmartphone1 m1 =new mysmartphone1();
//        m1.networks();
//        m1.takesnap();
//        m1.take4kvedio();
        camera1 cam = new mysmartphone1();
        cam. takesnap();
        cam.take4kvedio();
        // but we can't use cam. networks cause of polymorphism....
    }
}

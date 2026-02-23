package com.company;
import java.util.Scanner;
interface camera{
    void takesnap();
    void takevideo();
    private void greet(){
        System.out.println("hello....");
    }
    default void take4kvedio(){
        greet();
        System.out.println("taking 4k video");
    }
}
interface wifi{
    String[] networks();
    void connect_network(String networks );
}
class mycellphone1{
    void callnumber(int phno)
    {
        System.out.println("connecting"+ phno);

    }
    void phonecall(){
        System.out.println("connecting...");
    }
}
class mysmartphone extends mycellphone1 implements wifi,camera{
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
}
public class default_interfaces {
    public static void main(String[] args) {
    mysmartphone m1 =new mysmartphone();
    m1.networks();
    m1.takesnap();
    m1.take4kvedio();
//    Scanner sc =new Scanner(System.in);
//    String s= sc.nextLine();
//        System.out.println(s);

    }
}

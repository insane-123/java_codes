package com.company;
import java.util.Scanner;
//qs no 4...
class rectangle {
    Scanner sc = new Scanner(System.in);
    int area;
    int volume;
    public void setarea() {
        System.out.println("enter length...");
        int l = sc.nextInt();
        System.out.println("enter depth....");
        int d = sc.nextInt();
        area = l * d;
    }
    public void setVolume(){
        System.out.println("enter length...");
        int l = sc.nextInt();
        System.out.println("enter depth....");
        int d = sc.nextInt();
        System.out.println("enter height....");
        int h=sc.nextInt();
        volume=l*d*h;
    }
    public int getVolume(){
        System.out.println("volume of rectangle...");
        return volume;
    }

    public int getarea() {
        System.out.println("area of rectangle = ");
        return area;
    }
}
    class cubiod extends rectangle{
int cubevolume;
        public void setcubearea(){
            System.out.println("enter length...");
            int l = sc.nextInt();
            System.out.println("enter depth...");
            int d = sc.nextInt();
            System.out.println("enter height...");
            int h = sc.nextInt();
            area = 2*((l*h)+(l*d)+(d*h));
        }
        public int getcubearea(){
            System.out.println("area of cuboid...");
            return area;
        }
        public void setCubevolume(){
            System.out.println("enter length...");
            int l = sc.nextInt();
            System.out.println("enter depth...");
            int d = sc.nextInt();
            System.out.println("enter height...");
            int h = sc.nextInt();
            cubevolume=l*d*h;
        }
        public int getCubevolume(){
            return cubevolume;
        }
    }

public class chapter10_practiceset {
    public static void main(String[] args) {
    cubiod myproduct =new cubiod();
        System.out.println("area of rectangle needed requirements");
    myproduct.setarea();
        System.out.println(myproduct.getarea());
        System.out.println("area of cuboid needed requirements");
        System.out.println("");
        myproduct.setcubearea();
        System.out.println(myproduct.getcubearea());
        System.out.println("volume of rectangle needed requirements");
        System.out.println("");
        myproduct.setVolume();
        System.out.println(myproduct.getVolume());
    }
}

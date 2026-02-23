package com.company;
import java.util.Scanner;
//qs no 1:
//class cylinder{
//    private int radius;
//    private int height;
//    public int getRadius(){
//        return radius;
//    }
//    public void setRadius(){
//        Scanner sc = new Scanner(System.in);
//        int r = sc.nextInt();
//        radius=r;
//    }
//    public int getHeight(){
//        return height;
//    }
//    public void setHeight(){
//        Scanner sc = new Scanner(System.in);
//        int h = sc.nextInt();
//        height=h;
//    }
//}
//public class chapter9_practice_set {
//    public static void main(String[] args) {
//       cylinder New=new cylinder();
//        System.out.println("enter the radius: ");
//        New.setRadius();
//        System.out.println("return radius: ");
//        System.out.println(New.getRadius());
//        System.out.println("enter the length: ");
//        New.setHeight();
//        System.out.println("return height: ");
//        System.out.println(New.getHeight());
//    }
//}
//qs no 2:
//class cylinder{
//    private double volume;
//    private double surf_area;
//    public double getVolume(){
//        return volume;
//    }
//    public void setVolume(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter radius: ");
//        double r  = sc.nextDouble();
//        System.out.println("enter height ");
//        double h = sc.nextDouble();
//        volume=(3.14*r*r*h);
//    }
//    public double getArea(){
//        return surf_area;
//    }
//    public void setArea(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter radius: ");
//        double r  = sc.nextDouble();
//        System.out.println("enter height ");
//        double h = sc.nextDouble();
//        surf_area=2*3.14*r*(r+h);
//    }
//}
//public class chapter9_practice_set{
//    public static void main(String[] args) {
//        cylinder cp=new cylinder();
//        cp.setArea();
//        System.out.println("value of the area: ");
//        System.out.println(cp.getArea());
//        cp.setVolume();
//        System.out.println("volume of the element");
//        System.out.println(cp.getVolume());
//    }
//}
//qs no 3:
class cylinder{
    int radius;
    int height;
    cylinder(){
         height=1;
         radius=2;
//       ` System.out.println(radius);
//        System.out.println(height);`
    }
    public int geth(){
        return height;
    }
    public int getr(){
        return radius;
    }

}
public class chapter9_practice_set{
    public static void main(String[] args) {
        cylinder cp=new cylinder();
        System.out.println(cp.getr());
        System.out.println(cp.geth());
    }
}
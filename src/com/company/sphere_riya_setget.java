package com.company;
import java.util.*;
class base2{
    int radius;
int height;
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
public class sphere_riya_setget {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("radius is:");
        int x= sc. nextInt();
        System.out.println("breadth is: ");
        int y=sc.nextInt();
        base2 b=new base2();
        b.setRadius(x);
        System.out.println("radius is: "+b.getRadius());
        b.setHeight(y);
        System.out.println("breadth is: "+b.getHeight());
    }
}

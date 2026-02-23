package com.company;

import java.util.Scanner;
class cr{
    double radius;
    public double calculateArea(double radius){
        double area;
        area=(3.14)*radius*radius;
        return area;
    }
    public double calculatePerimeter(double radius){
        double perimeter;
        perimeter=2*(3.14)*radius;
        return perimeter;
    }
}
public class circle_radious {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        cr circle=new cr();
        System.out.println("enter the value of radius: ");
        double radius=sc.nextDouble();

        System.out.println("area is: "+circle.calculateArea( radius));
        System.out.println("perimeter is: "+circle.calculatePerimeter(radius));
    }
}
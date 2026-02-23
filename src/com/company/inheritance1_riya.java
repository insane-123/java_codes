package com.company;

import org.w3c.dom.ls.LSOutput;

class animal1{
   String x;
    public void setX(){
        x="animal is conserved at alipur zoo";
    }
    public String getX(){
        return x;
    }
}
class dog1 extends animal1{
    String y;
    public void setY(){
        y="but street dog is not";
    }
    public String getY(){
        return y;
    }

}
public class inheritance1_riya {
    public static void main(String[] args) {

dog1 d=new dog1();
d.setX();
d.setY();
        System.out.println(d.getX());
        System.out.println(d.getY());
    }
}

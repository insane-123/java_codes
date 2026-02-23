package com.company;
class cp{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int y) {
        x = y;
    }
}
 class derived extends cp{
 int y;

     public int getY() {
         return y;
     }

     public void setY(int x) {
         this.y = x;
     }
 }
 class animal{
    String y;
    public String sety(){
        y="eating milk from mother";
        return y;
    }
 }
 class dog extends animal{
    String d;

     public String getD() {
         d= "barking"+"\n"+"running";

         return d;
     }


 }
public class inheritance {
    public static void main(String[] args) {
        //cp class new code;
        cp sayan=new cp();
        sayan.setX(13);
        System.out.println(sayan.getX());
        //derived class code
        derived s =new derived();
        s.setX(23);
        System.out.println(s.getX());
        s.setY(46);
        System.out.println(s.getY());
        //quick problem animal class and subclass dog
        animal doggy=new animal();
        System.out.println(doggy.sety());
        dog doggy1=new dog();
        System.out.println(doggy1.sety());
        System.out.println(doggy1.getD());
        }
    }
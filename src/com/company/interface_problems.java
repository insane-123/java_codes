package com.company;
interface cycle {
    int c=34;
    void applybreak(int b);
    void applyspeed(int s);
}
interface bycycle_horn{
    void blowhorn();
    void blowhorn1();
}
class hero_cycle implements cycle,bycycle_horn{
    hero_cycle(){

        System.out.println("it is a hero cycle...");
    }
    public void applybreak(int a){
        System.out.println("applying break for cycle..");
    }
    public void applyspeed(int s){
        System.out.println("apply speed for cycle... ");
    }
    public void blowhorn(){
        System.out.println("kabhi khusi kabhi gam");
    }
    public void blowhorn1(){
        System.out.println("pee poo");
    }
}
public class interface_problems
{
    public static void main(String args[]){
hero_cycle cycle1=new hero_cycle();
cycle1.applybreak(1);
System.out.print("age of the cycle is:  ");

System.out.println(cycle1.c);
        System.out.println("trying to blow horn .....");
        cycle1.blowhorn1();
        System.out.println("long distance horn activated .....");
        cycle1.blowhorn();

    }
}


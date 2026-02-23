package com.company;
import java.util.*;
class employee5{
    private int salary;
    public void setSalary(int x){
        salary=x;
    }
    public int getSalary(){
        return salary;
    }
}
class derived2 extends employee5 {
    int salary1;
    public void setSalary1(int y){
        salary1=y;
    }
    public int getSalary1() {

        return salary1;
    }
}
public class inheritance_riya {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        derived2 riya=new derived2();
        System.out.println("salary for first employee: ");
        int salary=sc.nextInt();
        System.out.println("salary for second employee: ");
        int salary1=sc.nextInt();
     riya.setSalary(salary);
        riya.setSalary1(salary1);
        System.out.println("salary of Sayan: ");
        System.out.println(riya.getSalary());
        System.out.println("salary of riya: ");
        System.out.println(riya.getSalary1());
    }
}

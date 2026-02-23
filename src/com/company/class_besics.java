package com.company;
import java.lang.String;
class employee{
    int id;
    String name;



    String salary;
    public void printdetails(){
        System.out.println("my id is : "+ id);
        System.out.println("my name is : "+ name);
    }
    public String printsalary(){
        return salary;
    }
}
public class class_besics {

    public static void main(String[] args) {
        employee sayan=new employee();
        employee raju =new employee();

        //setting attributes
        sayan.id=12;
        sayan.name="king";
        sayan.salary="22k";
        raju.id=18;
        raju.name="raju chowhan";
        raju.salary="12K";
        //printing  properties or attributes
//        System.out.println(sayan.id);
//        System.out.println(sayan . name);
        sayan.printdetails();
        raju.printdetails();
        //String salary=sayan.printsalary();
        String salary=raju.printsalary();
        System.out.println(salary);


    }
}

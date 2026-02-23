package com.company;
import java.util.*;
class user{
    int user_id;
    long password;
    String name;
    String email;
    String role;
    public void register(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name =sc.nextLine();
        System.out.println("Enter your email: ");
        email=sc.nextLine();
        System.out.println("Enter your role: ");
        System.out.println("1. Guest");
        System.out.println("2. Staff");
        System.out.println("3. Admin");
        String var=sc.nextLine();
        switch (var){
            case "Guest":
                System.out.println("You are registered as a Guest");
                break;
            case "Staff":
                System.out.println("You are registered as a Staff");
                break;
            case "Admin":
                System.out.println("You are registered as a Admin");
                break;
            default:
                System.out.println("wrong answer");
        }
    }
    public void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter User_id: ");
        user_id=sc.nextInt();
        System.out.println("Enter password: ");
        password=sc.nextLong();
    }

}
class room{
int Room_Id;
String Room_Number;
String Room_Type;
int Capacity;
Double price;
String Description;

    public void setRoom_Id(int Room_Id) {
        this.Room_Id = Room_Id;
    }
    public int getRoom_Id(){
        return Room_Id;
    }
    public void setRoom_Number(String Room_Number){
        this.Room_Number = Room_Number;
    }
    public String getRoom_Number(){
        return Room_Number;
    }
    public void setRoom_Type(String Room_Type){
        this.Room_Type=Room_Type;
    }
    public String getRoom_Type(){
        return Room_Type;
    }




}
class booking{

}
class payment{

}
public class room_booking_class {
    public static void main(String[] args) {

    }
}

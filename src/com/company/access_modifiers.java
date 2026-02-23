package com.company;
class new_employee{
int id;
String name;
private void makemoney(){
    System.out.println("making money");
}
public void getvalue(){
    makemoney();
}

}
public class access_modifiers {
    public static void main(String[] args) {
        new_employee sayan = new new_employee();
        sayan.id = 30;
        sayan.name = "king";
        System.out.println(sayan.id);
        //sayan.makemoney();-> it throws error cause makemoney function is a private access modifier
        sayan.getvalue();

    }
}
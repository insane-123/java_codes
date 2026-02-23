package com.company;
class mymain_employee{
    private int id;
    private String name;
    public void setid(int i){
        id=i;
    }

    public mymain_employee(int main){
        id=main;
        name="sayan";
    }
    public mymain_employee(){
        id=12;
        name="raju";
    }

    public int getid(){
        return id;
    }
    public void setname(String m){
        name=m;
    }
    public String getname(){
        return name;
    }
}
public class constructors {
    public static void main(String[] args) {
       // mymain_employee sayan=new mymain_employee(45);
        mymain_employee sayan=new mymain_employee();
      //  sayan.setname("ramesh");
        System.out.println(sayan.getname());
        System.out.println(sayan.getid());
    }
}

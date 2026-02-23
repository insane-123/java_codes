package com.company;
class phone{
    String n;
    public void setN(){
       n="call , massage,";
    }
    public String getN(){
        return n;
    }
}
class smartphone extends phone{
    String m;
    public String getM() {
        return m;
    }
    public void setM() {
        m="whatsapp , facebook, instagram";
    }
}
public class inheritance3_riya {
    public static void main(String[] args) {
smartphone realme=new smartphone();
realme.setN();
realme.setM();
        System.out.println("features of smartphone are: ");
        System.out.print(realme.getN());
        System.out.println(realme.getM());
    }
}

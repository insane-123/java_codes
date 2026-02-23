package com.company;
import java.util.Scanner;
//question2
//class iphone{
//    String qualities;
//    public String qualities(){
//        Scanner sc =new Scanner(System.in);
//       String qualities = sc.nextLine();
//        return qualities;
//    }
//}
//class  myemployee{
//    int salary;
//    String name;
//    public int getSalary()
//    {
//        return salary;
//    }
//     public void getname(){
//            System.out.println(name);
//    }
//    public String getname(){
//        return name;
//    }
//    public String setname(){
//        Scanner sc =new Scanner(System.in);
//String name1=sc.nextLine();
//        System.out.println("new name");
//return name1;
//    }
//}
//question no: 4
//class rectangle {
//    int side;
//    int area;
//    int perimeter;
//
//    public int calc_area() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the length: ");
//        int l = sc.nextInt();
//        System.out.println("enter the width: ");
//        int w = sc.nextInt();
//        System.out.println("area of rectangle: ");
//        int a = l * w;
//        return a;
//    }
//
//    public int calc_perimeter() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the length: ");
//        int l = sc.nextInt();
//        System.out.println("enter the width: ");
//        int w = sc.nextInt();
//        System.out.println("area of perimeter ");
//        int p = 2 * (l + w);
//        return p;
//    }
//}
//
//
//    public class chapter8_practice_set {
        //    public static void main(String[] args) {
//        myemployee sayan=new myemployee();
//        sayan.salary=50;
//        sayan.name="Sayan Maity";
//
//       int salary= sayan.getSalary();
//        System.out.println("my salary: ");
//        System.out.println(salary);
//        System.out.println("my name: ");
//        //sayan.getname();
//        String name = sayan.getname();
//        System.out.println(name);
//        System.out.println("change name: ");
//        System.out.println(sayan.setname());
//
//    }
        //question 2:
//public static void main(String[] args) {
//    iphone nokia=new iphone();
//    System.out.println("qualities of nokia : ");
//    System.out.println(nokia.qualities());
//
//}
        //question no 4:
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("what do you want \n " +
//                    "1.area of rectangle \n" +
//                    "2.perimeter of rectangle\n");
//            int i = sc.nextInt();
//            rectangle rectangle1 = new rectangle();
//            switch (i) {
//                case(1):
//                System.out.println(rectangle1.calc_area());
//                break;
//                case(2):
//                System.out.println(rectangle1.calc_perimeter());
//                break;
//                default:
//                    System.out.println("invalid input");
//            }
//        }
//    }
//ques no 5:
//class tommy_vecetti{
//    String s;
//    public void shooting(){
//        s="shooting";
//        System.out.println(s);
//    }
//    public void running(){
//        s="running";
//        System.out.println(s);
//    }
//    public void hitting(){
//        s="hitting";
//        System.out.println(s);
//    }
//
//}
//public class chapter8_practice_set {
//    public static void main(String[] args) {
//tommy_vecetti rockstar=new tommy_vecetti();
//Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number:"+"\n"+"1. shooting\n 2.running\n 3.hitting\n");
//        System.out.println(":-");
//int i=sc.nextInt();
//switch (i){
//    case 1:
//        rockstar.shooting();
//    break;
//    case 2:
//        rockstar.running();
//        break;
//    case 3:
//        rockstar.hitting();
//    default:
//        System.out.println("wrong input");
//}
//    }
//}
//question 6
class circle{
    double c;

    public double circle_side(double s){

        c=s;
        System.out.println("radius: ");
        return c;
    }
    public double circle_perimeter (double s){

        c=2*3.14*s;
        System.out.println("perimeter1: ");
        return c;
    }
}
public class chapter8_practice_set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side value:");
        double s=sc.nextDouble();
        circle c1 = new circle();
        System.out.println(c1.circle_side(s));
        System.out.println(c1.circle_perimeter(s));
    }
}
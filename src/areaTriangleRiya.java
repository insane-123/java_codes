
import java.util.*;
public class areaTriangleRiya {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first value");
        double a=sc.nextDouble();
        System.out.println("enter the second value");
        double b=sc.nextDouble();
        System.out.println("enter the third value");
        double c=sc.nextDouble();
        double s=(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("area is: "+area);

    }
}

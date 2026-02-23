import java.sql.SQLOutput;
import java.util.*;
public class fact {
    public static void main(String[]agrs){
        System.out.println("enter the value: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial is: "+fact);
    }
}

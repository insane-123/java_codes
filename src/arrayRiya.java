import java.util.*;
public class arrayRiya {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size: ");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("value is: ");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("array is ");
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
}

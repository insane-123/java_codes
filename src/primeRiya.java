import java.util.*;
public class primeRiya {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        if(n==0||n==1){
            flag=1;
        }
        for(int i=1;i<=n;i++){
            if(i%2==0){
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("it is prime");
        }
        else{
            System.out.println("it is not prime");
        }
    }
}

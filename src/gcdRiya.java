public class gcdRiya {
    public static void main(String[]args){
        int n1=17;
        int n2=15;
        while(n1!=n2)
        {
            if(n1>n2)
             n1=n1-n2;
            else
                n2=n2-n1;
        }
        System.out.println("gcd of n1 and n2 is: "+n2);

    }
}

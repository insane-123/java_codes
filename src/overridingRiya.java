import java.sql.SQLOutput;

class A{
    void run(){
        System.out.println("it is running...");
    }
}
class B extends A{
    void run(){
        System.out.println("with speed..");
    }
}
public class overridingRiya {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        b.run();
    }
}

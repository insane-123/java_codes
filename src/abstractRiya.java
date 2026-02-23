abstract class cellphone{
    cellphone(){
        System.out.println("cellphone is old");
    }
    abstract public void massage();
    abstract public void facebook();
}
class smartphone extends cellphone{
    public void massage(){
        System.out.println("massage is available..");
    }
    public void facebook(){
        System.out.println("facebook is available..");
    }
}
public class abstractRiya {
    public static void main(String[] args) {
        smartphone s=new smartphone();
        s.facebook();
        s.massage();
    }
}

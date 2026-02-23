class cubeCylinder{
    cubeCylinder(float a,float r,float h){
        float v=a*a*a;
        System.out.println("volume of cube: "+v);
        float v1=(float)3.14*r*r*h;
        System.out.println("volume of cylinder is: "+v1);
    }
}
public class overloadingRiya {
    public static void main(String[]args){
        cubeCylinder i=new cubeCylinder(2.0f,3.5f,6.4f);
    }

}

class encap{
    private String id;
    private int age;
    private String name;
    public String getId(){
        return id;
    }
    public void setId(String newId){
        id=newId;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge ){
        age=newAge;
    }
}
public class encapRiya {
    public static void main(String[]args){
        encap e=new encap();
        e.setAge(34);
        System.out.println("age is:"+ e.getAge());
    }
}

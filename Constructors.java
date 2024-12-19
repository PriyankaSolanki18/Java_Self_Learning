class Human{
    static int age;
    static String name;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
public class Constructors {
    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getAge()+" : "+obj.getName());
        obj.setAge(23);
        obj.setName("priyanka");
        System.out.println(obj.getAge()+" : "+obj.getName());
    }   
}

class Human{
    static int age;
    static String name;

    //default constructor
    public Human(){
        age=12;
        name="Priya";
    }


    //parameterized constructor
    public Human(int a, String n){
        age=a;
        name=n;
    }

    public Human(String name){
        this.age=1;
        this.name=name;
    }

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
public class Constructor1 {
    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getAge()+" : "+obj.getName());
        obj.setAge(23);
        obj.setName("priyanka");
        System.out.println(obj.getAge()+" : "+obj.getName());
        Human obj1 = new Human(27,"Krishn");
        System.out.println(obj1.getAge()+" : "+obj1.getName());
        Human obj2= new Human("Radha");
        System.out.println(obj2.getAge()+" : "+obj2.getName());
    }   
}

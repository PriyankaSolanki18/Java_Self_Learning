/*
 * class - class -> extends
 * class - interface -> implements
 * interfce - interface -> extends
 */

interface A{
    void run();
}
interface B{
    void walk();
    void speak();
}
interface C extends B{

}
class X implements A,C   // here A,B can be used and we are able to use C coz C is extending the interface B
{

    public void walk() {
        System.out.println("walking...");
    }

    public void speak() {
        System.out.println("speaking...");
    }

    public void run() {
        System.out.println("running...");
    }
    
}
public class Interfaces2 {
    public static void main(String[] args) {
        A obj = new X();
        obj.run();

        B obj1 = new X();   
        obj1.walk();
        obj1.speak();
    }
}

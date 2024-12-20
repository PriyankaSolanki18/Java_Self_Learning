/*A functional interface in Java 8 is an interface that contains exactly one abstract method. This concept is also known as 
Single Abstract Method (SAM) Interfaces. Functional interfaces can have any number of default or static methods, but only one 
abstract method. */

@FunctionalInterface
interface A
{
    void show();
}

// class B implements A{
//     public void show(){
//         System.out.println("in show");
//     }
// }
public class FunctionalInterfaces {
    public static void main(String[] args) {
        // A obj = new B();
        A obj = new A() 
        {
            public void show(){
                System.out.println("in new show");
            }    
        };
        obj.show();
    }
}

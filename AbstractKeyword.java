/*
 * NOTE: We can't create object of an abstract class
 * 
 * Abstract methods can be declared only in Abstract class but Abstract class can have abstract 
 * as well as non abstract or normal methods
 * 
 * It is neccessary to define all the abstract methods in the sub class that is extending from 
 * the parent class
 * But, if we don't want to define abstract methods we can make the sub class also abstract
*/

abstract class Car {
    public abstract void drive();
    public abstract void fly();

    public void musicPlaying(){
        System.out.println("Playing music...");
    }
}
// class WagonR extends Car{
//     public void fly(){
//         System.out.println("Flying...");
//     }
//     public void drive(){
//         System.out.println("Driving...");
//     }
// }
abstract class WagonR extends Car{
    // public void fly(){
    //     System.out.println("Flying...");
    // }
    public void drive(){
        System.out.println("Driving...");
    }
}
class UpdatedWagonR extends WagonR{     //concerete class - we can create object of concrete class
    public void fly() {
        System.out.println("Flying...");
    }
    
}
public class AbstractKeyword {
    public static void main(String[] args) {
        // WagonR obj = new WagonR();
        UpdatedWagonR obj = new UpdatedWagonR();
        obj.drive();
        obj.musicPlaying();
        obj.fly();
    }
}

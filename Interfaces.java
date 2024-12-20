/*

 * Types of interfaces :- All the methods in interface are 'public abstract'
 * 1. Normal - interface with multiple methods
 * 2. Functional / SAM (Single abstract method) - interfface having only one method
 * 3. Marker - interface that has no methods (blank interface) created to update somehting to the compiler
 * 
 * Serialization is a mechanism of converting the state of an object into a byte stream. Deserialization is the reverse process where 
 * the byte stream is used to recreate the actual Java object in memory. This mechanism is used to persist the object.
 * 
 * Serialization and deserialization are crucial for saving and restoring the state of objects in Java.
 * 
 * The byte stream created is platform independent. So, the object serialized on one platform can be deserialized on a different
 * platform. To make a Java object serializable we implement the java.io.Serializable interface. The ObjectOutputStream class contains
 * writeObject() method for serializing an Object. 
 

public final void writeObject(Object obj)
                       throws IOException


The ObjectInputStream class contains readObject() method for deserializing an object. 
 

public final Object readObject()
                  throws IOException,
               ClassNotFoundException



Only the objects of those classes can be serialized which are implementing java.io.Serializable interface. Serializable is a marker 
interface (has no data member and method). It is used to “mark” java classes so that objects of these classes may get certain capability.
 Other examples of marker interfaces are:- Cloneable and Remote.

 */

interface A{
    int age=8;     //every variable in interface are by default 'final and static'
    String area="ggn";

    void show();   // by default every method in interface is 'public abstract' thus we don't have to mention it explicitly like [ public abstract void show(); ] 
    void config();
}
class B implements A{     // while implementing the interface we only get the methods not the variables that is why they are static and final and can't be changed
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        // A.area="Pune";  // we can't change the value of area as it is a static and final variable
        System.out.println(A.area);
    }
}

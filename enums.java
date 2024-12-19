/*
 * Enumerations or Java Enum serve the purpose of representing a group of named constants in a
 * programming language. Java Enums are used when we know all possible values at compile time, 
 * such as choices on a menu, rounding modes, command-line flags, etc.
 * 
 * A Java enumeration is a class type. Although we don’t need to instantiate an enum using new, 
 * it has the same capabilities as other classes. This fact makes Java enumeration a very powerful tool.
 * Just like classes, you can give them constructors, add instance variables and methods, and even 
 * implement interfaces.
 * 
 * One thing to keep in mind is that, unlike classes, enumerations neither inherit other classes nor can 
 * get extended(i.e become superclass).  We can also add variables, methods, and constructors to it. The
 * main objective of an enum is to define our own data types(Enumerated Data Types).
 * 
 * Enum declaration can be done outside a class or inside a class but not inside a method
 * 
 * 1. Declaration outside the class:-
 enum Color {
    RED,
    GREEN,
    BLUE;
}

public class Test {
    // Driver method
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);
    }
}


* 2. Declaration inside a class:-
public class Test {
    enum Color {
        RED,
        GREEN,
        BLUE;
    }

    // Driver method
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);
    }
}

*NOTE: The first line inside the enum should be a list of constants and then other things like methods,
*      variables (Capital letters), and constructors.
*
*Implicit Modifiers: Every enum constant is implicitly public static final. Since it is static,
* it can be accessed using the enum name. Since it is final, enums cannot be extended.




// Java Program to implement
// Enum in a Switch Statement
import java.io.*;

// Driver Class
class GFG {
    // Enum Declared
    enum Color {
        RED,
        GREEN,
        BLUE,
        YELLOW;
    }

    // Main Function
    public static void main(String[] args) {
        Color var_1 = Color.YELLOW;

        // Switch case with Enum
        switch (var_1) {
        case RED:
            System.out.println("Red color observed");
            break;
        case GREEN:
            System.out.println("Green color observed");
            break;
        case BLUE:
            System.out.println("Blue color observed");
            break;
        default:
            System.out.println("Other color observed");
        }
    }
}




Enum and Methods:- Enums can have both concrete and abstract methods. If an enum class has an abstract
 method, each enum constant must implement it.

 // Java program to demonstrate that enums can have
// constructor and concrete methods.

// An enum (Note enum keyword in place of class keyword)
enum Color {
    RED,
    GREEN,
    BLUE;

    // Enum constructor called separately for each
    // constant
    private Color() {
        System.out.println("Constructor called for : " + this.toString());
    }

    public void colorInfo() {
        System.out.println("Universal Color");
    }
}

public class Test {
    // Driver method
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);
        c1.colorInfo();
    }
}

Output :- 
Constructor called for : RED
Constructor called for : GREEN
Constructor called for : BLUE
RED
Universal Color



*/

enum Status{         // by default status is consider as a class thus we can create it's object in main method
    RUNNING, PENDING, FAILED, SUCCESS;       //these are the objects of the enum Status
}
public class enums {
    public static void main(String[] args) {
        Status s = Status.RUNNING;
        System.out.println(s);
        s = Status.PENDING;
        System.out.println(s);

        System.out.println();

        for (Status var_1 : Status.values()) {
            System.out.println(var_1);
            System.out.println(var_1.ordinal());
        }
    }
}
class Parent {
    Parent() {
        System.out.println("Parent constructor called");
    }
    
    Parent(String message) {
        System.out.println("Parent constructor with message: " + message);
    }
}

class Child extends Parent {
    Child() {
        // Implicitly calls super()
        System.out.println("Child constructor called");
    }

    Child(String message) {
        super(message); // Explicit call to parent constructor
        System.out.println("Child constructor with message: " + message);
    }
}

public class superInConstructor {
    public static void main(String[] args) {
        new Child(); // Calls no-argument constructors
        new Child("Hello!"); // Calls parameterized constructors
    }
}

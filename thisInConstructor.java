class Example {
    int x, y;

    // No-argument constructor
    Example() {
        this(0, 0); // Calls parameterized constructor
        System.out.println("No-argument constructor");
    }

    // Parameterized constructor
    Example(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Parameterized constructor called: x=" + x + ", y=" + y);
    }
}

public class thisInConstructor {
    public static void main(String[] args) {
        new Example(); // Calls no-argument constructor, which calls parameterized constructor
    }
}

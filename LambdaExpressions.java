/*

Lambda expressions, introduced in Java SE 8, provide a concise way to represent instances of single-method interfaces 
(functional interfaces) using a block of code. They allow you to treat functionality as a method argument, or pass a block of 
code around as if it were an object.

Syntax and Usage

The basic syntax of a lambda expression is:

(parameter1, parameter2) -> expression
For example, a simple lambda expression that takes one parameter and prints it:

(n) -> System.out.println(n);
If you need to perform more complex operations, you can use a code block with curly braces:

(parameter1, parameter2) -> {
// code block
return value;
}
Example: Using Lambda Expressions with Collections

Lambda expressions are often used with collections to iterate, filter, and extract data. Here is an example of using a lambda 
expression with the forEach method of an ArrayList:

import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(5);
numbers.add(9);
numbers.add(8);
numbers.add(1);

// Using lambda expression to print each element
numbers.forEach((n) -> System.out.println(n));
}
}
Example: Storing Lambda Expressions in Variables

Lambda expressions can be stored in variables if the variable's type is an interface with a single method. For example, using Java's 
Consumer interface:

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
public static void main(String[] args) {
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(5);
numbers.add(9);
numbers.add(8);
numbers.add(1);

// Storing lambda expression in a variable
Consumer<Integer> method = (n) -> System.out.println(n);
numbers.forEach(method);
}
}
Example: Passing Lambda Expressions as Method Parameters

You can pass lambda expressions as parameters to methods that accept functional interfaces. For example:

interface StringFunction {
String run(String str);
}

public class Main {
public static void main(String[] args) {
StringFunction exclaim = (s) -> s + "!";
StringFunction ask = (s) -> s + "?";

printFormatted("Hello", exclaim);
printFormatted("Hello", ask);
}

public static void printFormatted(String str, StringFunction format) {
String result = format.run(str);
System.out.println(result);
}
}
Benefits and Limitations

Benefits

Conciseness: Lambda expressions reduce the amount of boilerplate code.

Functional Programming: They enable functional programming techniques in Java.

Readability: Code using lambda expressions can be more readable and expressive.

Limitations

Functional Interfaces Only: Lambda expressions can only be used with functional interfaces (interfaces with a single abstract method).

Debugging: Debugging lambda expressions can be more challenging compared to traditional methods.

Lambda expressions are a powerful feature in Java that enhance the language's expressiveness and enable more concise and readable code
They are particularly useful in scenarios involving collections and functional interfaces

*/

@FunctionalInterface
interface A
{
    void show(int i);
    // void show(int i, int j);
}

public class LambdaExpressions {
    public static void main(String[] args) {
        A obj = i -> System.out.println("in lambda show...");  //if we have only one variable we don't have to put () around 'i'
        obj.show(5);

        // A obj1 = (int i, int j) -> System.out.println("2 parameters : "+i+" "+j);
        // obj.show(5,6);
    }
}

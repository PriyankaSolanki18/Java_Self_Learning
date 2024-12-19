/*
 * POLYMORPHISM - Many Behaviours / many forms
 * 2 types:-
 * 1. Compile time / early binding - Eg. Method Overloading -> add(int a, int b){}
 * 2. Ruun time / late binding - Eg. Method Overriding -> class A{ add(int a, int b) {} }
 *                                                        class B{ add(int a, int b) {} }
 * 
 * 
 * Dynamic Method Dispatch (DMD) -> to implemenmt run time polymorphism we use this DMD
*/

class A{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}
class C extends A{
    public void show(){
        System.out.println("in C show");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();
        
        obj = new C();
        obj.show();
    }
}

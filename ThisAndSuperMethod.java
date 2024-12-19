class A extends Object{
    public A(){
        super();
        System.out.println("In A");
    }
    public A(int n){
        super();
        System.out.println("In A int");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("In B");
    }
    public B(int n){
        // super();
        this(); //will call the constructor of the same class i.e., public B(){---}
        System.out.println("In B int");
    }
}
public class ThisAndSuperMethod {
    public static void main(String[] args) {
        B obj = new B(5);
       // B obj = new B(4);
       System.out.println(obj);
    }
}

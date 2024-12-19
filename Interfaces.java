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

abstract class A {
    public abstract void show();
    public abstract void config();
}
// class B extends A{
//     public void show(){
//         System.out.println("in B show");
//     }
// }
public class AbstractAnonymousInnnerClass {
    public static void main(String[] args) {
        // A obj = new B();
        // obj.show();

        A obj = new A()   //here we are not creating the object of abstract class but creating the object of anonymous inner class that's why we are able to write the code [ A obj = new A() ]
        {                           //to implement interface or inner class only once we use anonymous inner class
            public void show()
            {
                System.out.println("in new show");
            }

            public void config() {
                System.out.println("in config");
            }
        };
        obj.show();  //  obj is the object of anonymous inner class
        obj.config();
    }
}

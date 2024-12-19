/* 

class A{
    int age;
    public void show(){
        System.out.println("in show");
    }
    static class B{   // static can be used only for inner class
        public void config(){
            System.out.println("in config");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        // A.B obj1 = obj.new B();
        A.B obj1 = new A.B();   //this will work only when inner class is static
        obj1.config();
    }
}

*/




//------------------------------------


// Anonymous inner class

class A{
    public void show(){
        System.out.println("in A show");
    }
}
// class B extends A{
//     public void show(){
//         System.out.println("in B show");
//     }
// }
public class InnerClass {
    public static void main(String[] args) {
        // A obj = new A();
        A obj = new A()
        {                      // this is called inner class/ annonymous class as it don't have a name
            public void show()
                {
                    System.out.println("in new show");
                }
        };
        obj.show();
    }
}
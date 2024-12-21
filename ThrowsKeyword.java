// Ducking exception using throws 

class A{
    public void show() throws ClassNotFoundException
    {
        // try{
            Class.forName("ThrowsKeyword");
        // }
        // catch(ClassNotFoundException e){
        //     System.out.println("Not able to find the class "+e);
        // }
    }
}

public class ThrowsKeyword {
    static{
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) {  // not recommended don't use throws with main method i.e., throws ClassNotFoundException
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

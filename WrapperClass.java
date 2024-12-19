/*
 * Wrapper Class - The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive
 * 
 * The automatic conversion of primitive into an object is known as autoboxing and vice-versa unboxing.
 * 
 * Autoboxing - int num = 7;
 *              Integer num1 = new Integer(num);  // int to Integer called 'Boxing'
 *              Integer num1 = num;  // Autoboxing
 *              int num2 = num1.intValue();   //unboxing
 *              int num2 = num1;  //auto unboxing
 * 
 * Unboxing - Integer i = new Integer(10);
              int j = i; // Unboxing: Integer to int
*/
public class WrapperClass {
    public static void main(String[] args) {
        String str="12";
        int num = Integer.parseInt(str);
        System.out.println(num*2);
    }
}

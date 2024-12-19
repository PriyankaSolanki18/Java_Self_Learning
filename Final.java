//final - variable, method, class

/*
1. To make a variable constant use final keyword before variablr i,.e, final int age=18;
*/



//2. final class - no one can extends it , we are stopping the inheritance
/* 
final class Calc{
    public void show(){
        System.out.println("in Calc show");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
class AdvCalc extends Calc{

}
*/


// 3. final method - To stop method overriding we make the method final
/* 
class Calc{
    public final void show(){
        System.out.println("by Radha");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
class AdvCalc extends Calc{
    public void show(){
        System.out.println("by Priya");
    }
}
*/
public class Final {
    public static void main(String[] args) {
        
    }
}

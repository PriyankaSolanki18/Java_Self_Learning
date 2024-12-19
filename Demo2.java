interface Computer{
    public abstract void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile , run");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile, run : faster");
    }
}
class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer priya = new Developer();

        priya.devApp(lap);
        priya.devApp(desk);
    }
}

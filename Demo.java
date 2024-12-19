import tools.Calc;
import tools.VeryAdvCalc;

public class Demo {
    public static void main(String[] args) {
        Calc obj1 = new Calc();
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(3, 6);
        int r2 = obj.sub(5, 1);
        int r3 = obj.multi(3, 8);
        int r4 = obj.div(15, 4);
        double r5 = obj.power(2,3);
        int r6 = obj1.add(5 ,7);
        System.out.println(r6);
        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
    }
}

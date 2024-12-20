
public class MultipleTryCatch {
    public static void main(String[] args) {
        int i=0;
        int j=0;

        int nums[] = new int[5];

        try{
            j=8/i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limits");
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}


public class MultipleTryCatch {
    public static void main(String[] args) {
        int i=0;
        int j=0;

        // int nums[] = new int[5];

        // String str = null;

        try{
            j=8/i;
            // System.out.println(str.length());
            // System.out.println(nums[1]);
            // System.out.println(nums[5]);
            if(j==0)
                throw new ArithmeticException("I don't want to print 0");
        }
        catch(ArithmeticException e){
            // System.out.println("Cannot divide by zero");
            j=18/1;   //exception handling
            System.out.println("that is the default output "+e);
        }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Stay in your limits");
        // }
        catch(Exception e){
            System.out.println("Something went wrong..."+e );
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}

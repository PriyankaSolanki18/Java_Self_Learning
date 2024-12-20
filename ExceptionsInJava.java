/*
 * Error - types :-
 * 1. Compile time error
 * 2. Run time error - exception handling
 * 3. Logical error
 * 
 * Statement needs to be handled, statement can be of 2 types: normal, critical
 */

public class ExceptionsInJava {
    public static void main(String[] args) {
        int i=0; //normal statement
        int j=0;

        try
        {
        j=18/i; //critical statement
        }
        catch(Exception e){   //catch block will execute only in the case some exception arise
            System.out.println("something went wrong...");
        }

        System.out.println(j);

        System.out.println("Bye");
    }
}

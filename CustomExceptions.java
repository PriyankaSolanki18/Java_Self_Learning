class PriyankaException extends Exception{
    public PriyankaException(String string){
        super(string);
    }
}

public class CustomExceptions {
    public static void main(String[] args) {
        int i=20;
        int j=0;

        try{
            j=18/i;
            if(j==0)
                throw new PriyankaException("I don't want to print 0");
        }
        catch(PriyankaException e){
            j=18/i;
            System.out.println("Thats the default output..."+e);
        }
        catch(Exception e){
            System.out.println("Something went wrong..."+e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}

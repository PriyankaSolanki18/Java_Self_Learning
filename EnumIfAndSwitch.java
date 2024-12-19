enum Status{
    RUNNING, PENDING, FAILED, SUCCESS;
}
public class EnumIfAndSwitch {
    public static void main(String[] args) {
        Status s = Status.PENDING;

        switch(s){
            case RUNNING:
            System.out.println("All goog");
            break;
            case PENDING:
            System.out.println("Please wait");
            break;
            case FAILED:
            System.out.println("Try again");
            default:
            System.out.println("Done");
        }


        System.out.println();


        
        if(s == Status.RUNNING)
        System.out.println("All good...");
        else if(s == Status.FAILED)
        System.out.println("Try Again...");
        else if(s == Status.PENDING)
        System.out.println("Please wait...");
        else
        System.out.println("Done");
    }
}

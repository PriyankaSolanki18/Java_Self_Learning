
import java.io.IOException;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException{
        System.out.println("enter num : ");
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        sc.close();
    }    
}

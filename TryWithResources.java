import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        int i=0;
        int j=0;
        try
        {
            j=18/i;
            // System.out.println("bye");
        }
        catch(Exception e)
        {
            System.out.println("something went wrong...");
            // System.out.println("bye");
        }
        finally   // irrespective if we get exception or not finally block will get executed. It is used when we want to close the resource
        {
            System.out.println("bye");
        }

        int num = 0;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))   // Its advantage is once the try block get over the resource 'br' will close automatically
        {
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }
}

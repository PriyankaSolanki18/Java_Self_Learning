//Case 1: From String to StringBuffer and StringBuilder
/* 

public class StrBuilderStrBuffer {
    public static void main(String[] args) {
        String str="Priyanka";

        System.out.println("Hii "+str);

        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        System.out.println("Reversed string : "+sbr);

        StringBuilder sbl = new StringBuilder(str);
        sbl.append(" Solanki");
        System.out.println("After appending : "+sbl);
    }
}

*/



//Case 2: From StringBuffer and StringBuilder to String 
/* 

public class StrBuilderStrBuffer{
    public static void main(String[] args) {
        StringBuffer sbr = new StringBuffer("Priyanka");
        StringBuilder sbl = new StringBuilder("Solanki");

        String str = sbr.toString();
        System.out.println("StringBuffer to String : "+str);

        String str1 = sbl.toString();
        System.out.println("StringBuilder to String : "+sbl);

        sbr.append(" Hiii");
        System.out.println("StringBuilder after appending "+sbr);

        sbl.reverse();
        System.out.println("StringBuffer after reversing "+sbl);

        System.out.println(str);
    }
}

*/



//Case 3: From StringBuffer to StringBuilder or vice-versa

public class StrBuilderStrBuffer{
    public static void main(String[] args) {
        StringBuilder sbr = new StringBuilder("Priyanka");

        String str = sbr.toString();

        StringBuffer sbl = new StringBuffer(str);
        System.out.println(sbl);
    }
}
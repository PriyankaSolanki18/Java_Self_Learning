
public class Stringbuffer{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("priyanka");

        System.out.println(sb.length());

        System.out.println(sb.capacity());

        sb.append(" solanki");
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);

        sb.deleteCharAt(2);
        System.out.println(sb);

        sb.insert(0, "Hello ");
        System.out.println(sb);

        sb.setLength(30);

        sb.ensureCapacity(100);
    }
}
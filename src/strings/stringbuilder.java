package strings;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abc");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        StringBuilder a=new StringBuilder("abcde");
        System.out.println(sb.compareTo(a));
        System.out.println(a.length());
        System.out.println(sb.equals(a));
        System.out.println(a.capacity());

    }
}

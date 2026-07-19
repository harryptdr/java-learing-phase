package strings;

public class equals {
    public static void main(String[] args) {
        String s="abc";
        String q=new String("abc");
        String r = "ab";
        r= r+"c";
        System.out.println(s==q);
        System.out.println(s.equals(q));
        System.out.println(s.equals(r));
    }
}

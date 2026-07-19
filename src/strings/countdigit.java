package strings;
import java.util.Scanner;
public class countdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter your number :");
        int n =sc.nextInt();
        String s=""+n;
        System.out.println(s);
        System.out.println(s.length());
    }
}

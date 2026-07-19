package strings;
import java.util.Scanner;
public class contvowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your string: ");
        String str = sc.nextLine();
        int count = 0;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            isvowel(ch);
            count++;
        }

        System.out.println(count);
    }

    public static boolean isvowel(char ch) {
        if (ch == 'a' || ch == 'A') return true;
        if (ch == 'e' || ch == 'E') return true;
        if (ch == 'i' || ch == 'I') return true;
        if (ch == 'o' || ch == 'O') return true;
        if (ch == 'u' || ch == 'U') return true;
       else return false;
    }
}

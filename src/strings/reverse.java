package strings;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());
        int n=sb.length();
        sb.reverse();
        System.out.println(sb);

    }
}

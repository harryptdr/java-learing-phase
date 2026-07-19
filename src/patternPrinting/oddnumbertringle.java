package patternPrinting;

import java.util.Scanner;

public class oddnumbertringle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number of row:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    if (j % 2 != 0) {
                        System.out.print(j + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}


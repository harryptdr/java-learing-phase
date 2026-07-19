package recursion;

import java.util.Scanner;

public class printnto1 {
    public static int print(int n){
        if(n==0)return 1;
        System.out.print(n+" ");
        return print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        print(n);
    }
}

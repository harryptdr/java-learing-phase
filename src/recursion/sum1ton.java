package recursion;

import java.util.Scanner;

public class sum1ton {
    static int n;
    public static int sum(int n,int s){
        if(n==0){
            System.out.println(s);
            return s;
        }
        sum(n-1,s+n);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        n=sc.nextInt();
        sum(n,0);
        int s=0;
    }
}

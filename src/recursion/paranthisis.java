package recursion;

import java.util.Scanner;

public class paranthisis {
    public static void print(int open,int close,int x,String s){
        if (s.length()==2*x){
            System.out.println(s);
            return;
        }
       if(open<x) print(open+1,close,x,s+"(");
       if(close<open) print(open,close+1,x,s+")");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int x=sc.nextInt();
        print(0,0, x,"");
    }
}

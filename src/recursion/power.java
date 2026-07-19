package recursion;

import java.util.Scanner;

public class power {
    //public static int pow(int n,int m){
      //  if(m==0)return 1;
       // return n*pow( n,m-1);
    //}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int n=sc.nextInt();
        System.out.print(n+"to the power of :");
        int m=sc.nextInt();
        System.out.println(pow(n,m));
    }
    public static int pow(int n,int m){
        if(m==0){
            return 1;
        }
        if(m%2==0){
            int ans=pow(n,m/2);
                    return ans*ans;
        }
        else {
            int ans=pow(n,m/2);
            return ans*ans*n;
        }
    }
}

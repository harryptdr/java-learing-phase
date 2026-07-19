package practiceloop;
import java.util.Scanner;
public class question1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a term:");
        int n=sc.nextInt();
        int sum=n*(n+1)/2;
        System.out.println("sum is :"+sum);
    }
}

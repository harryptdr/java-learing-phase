package basics;
import java.util.Scanner;
public class input {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius : ");
        int radius;
         radius = sc.nextInt();
         double pi=3.14;
         double area = pi * radius * radius;
         System.out.println("area of : "+area);
         System.out.print("string:");
         String a=sc.nextLine();
    }
}

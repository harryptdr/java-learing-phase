package basics;
import java.util.Scanner;
public class remender {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int divisor,dividend;
        System.out.print("enter a dividend number : ");
        dividend = sc.nextInt();
        System.out.print("enter a divisor number : ");
        divisor=sc.nextInt();
        int quient;
        quient=dividend/divisor;
        int remender=dividend-(quient*divisor);
        System.out.println("remender is : " +remender);
    }
}

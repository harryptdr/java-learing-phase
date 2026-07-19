package practice;
import java.util.Scanner;
public class question5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double r;
        System.out.print("Enter the radius of the circle:");
        r=sc.nextDouble();
        double z=3.14*r*r;
        System.out.println("Area of the circle:"+z);
        double p,q,t;
        System.out.print("Enter principal amount:");
        p=sc.nextDouble();
        System.out.print("Enter rate of interest:");
        q=sc.nextDouble();
        System.out.print("Enter time (in year):");
        t=sc.nextDouble();
        double a=(p*q*t)/100;
        System.out.print("simple interest:"+a);
    }
}

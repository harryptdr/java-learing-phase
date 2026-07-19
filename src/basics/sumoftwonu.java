package basics;
import java.util.Scanner;
public class sumoftwonu {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.print("enter a first nubmer : ");
        a=sc.nextInt();
        System.out.print("enter a second number : ");
        b=sc.nextInt();
        c=a+b;
        System.out.print("sum of two number is : ");
        System.out.println(c);
        int z=Math.min(a,b);
        System.out.println(z);

    }
}

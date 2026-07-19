package ifelse;
import java.util.Scanner;
public class evenodd {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("enter a  number :");
        x=sc.nextInt();
        if(x%2==0){
            System.out.println("given number is even");
        }
        else {
            System.out.println("given number is odd ");
        }
    }
}

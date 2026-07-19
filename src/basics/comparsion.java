package basics;
import java.util.Scanner ;
public class comparsion {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        int a,b;
        System.out.println("enter a  first number :");
        a=sc.nextInt();
        System.out.println("enter a second number ");
        b=sc.nextInt();
        if(a>b) {
            System.out.print("first number is greater than second number :" + a);
        }
            else{
                System.out.print("ssecond number greater :"+b);
            }
    }
}

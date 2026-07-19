package ifelse;
import java.util.Scanner;
public class divisibleby5 {
    public static  void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a  number : ");
        int n = sc. nextInt();
        if(n%5==0){
            System.out.print("given number is divisible by 5");
        }
        else{
            System.out.print("given number is not divisiable by 5");
        }
    }
}

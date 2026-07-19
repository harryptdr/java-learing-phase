package ifelse;
import java.util.Scanner;
public class gretest {
    public static void main(String [] args ){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("enter a  a number:");
        a=sc.nextInt();
        System.out.print("enter a b number:");
        b=sc.nextInt();
        System.out.print("enter a c number:");
        c=sc.nextInt();
        if(a>b&&a>c){
            System.out.print (a+ " is greatest");
        }
        else if(b>c&&b>c) {
            System.out.print(b+" is greatest");
        }
        else{
            System.out.print(c+" is greatest");
        }

    }
}

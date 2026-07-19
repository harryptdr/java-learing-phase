package ifelse;
import java.util.Scanner;
public class areaofrectangle {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int l,b;
        System.out.print("enter a lenth of rectanle:");
        l=sc.nextInt();
        System.out.print("enter a breath of rectanlge:");
        b=sc.nextInt();
        int z=l*b;
        System.out.println("area of rectanlge:"+z);
        int y=2*(l+b);
        System.out.println("peremeter of rectangle:"+y);
        if(z>y){
            System.out.print("area is greater than peremeter");
        }else{
            System.out.print("peremeter is greater than area");
        }
    }
}

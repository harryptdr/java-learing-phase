package practiceloop;
import java.util.Scanner;
public class question2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a first number: ");
        int x=sc.nextInt();
        System.out.print("enter a  second number:");
        int y=sc.nextInt();
        int gdc=1;
        for(int i=1;i<=x&&i<=y;i++){
            if(x%i==0&&y%i==0){
                gdc=i;
            }
        }
        System.out.print(gdc);
    }
}

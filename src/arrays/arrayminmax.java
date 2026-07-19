package arrays;
import java.util.Scanner;
public class arrayminmax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++) {
            arr[i]=sc.nextInt();
        }
        int a=0;
        int left=arr[0];
        for(int i=1;i<5;i++) {
            if(left>arr[i]){
                a=arr[i];
            }
            else{
                a=arr[i];
            }
        }
        System.out.println(a);
    }
}

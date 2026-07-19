package arrayprecticequestion;
import java.util.Arrays;
import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter you array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       Arrays.sort(arr);
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();
        int a=arr[n-2];
        System.out.println(a);


    }
}

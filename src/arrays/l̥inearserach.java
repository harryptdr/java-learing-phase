package arrays;
import java.util.Scanner;
public class l̥inearserach {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a target number:");
        int x=sc.nextInt();
        System.out.print("enter a size of array:");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.print("enter a array element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                flag=true;
                break;
            }
        }
        if (flag==true)System.out.println("element found");
        else System.out.println("element not found");
    }
}

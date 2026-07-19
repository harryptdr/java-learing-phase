package arrays;
import java.util.Scanner;
public class arrayinserting {
    public static void main(String[] args) {
        int arr[]={2,1,2,2,3,4,5,2};
        int n=arr.length;
        int x=2;
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                k=k+1;
            }
        }
        System.out.println(k);
    }
}


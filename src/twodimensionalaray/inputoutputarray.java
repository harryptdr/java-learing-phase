package twodimensionalaray;
import java.util.Scanner;
public class inputoutputarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        //declaration
        int [][] arr=new int[3][3];
        int m=arr.length;//no of rows
        int n=arr[0].length;//no of columns
        System.out.println(m);
        System.out.println(n);
        //input
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

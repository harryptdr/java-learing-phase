package multidaimentionarray;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        int [][] arr=new int[2][4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //sum
        int sum=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                sum=sum+arr[i][j];
            }

        }
        System.out.println(sum);
    }
}

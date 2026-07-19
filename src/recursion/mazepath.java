package recursion;

import java.util.Scanner;

public class mazepath{
    public static int maze(int row,int col,int m,int n){
        if(row==m||col==n)return 1;
         int rigthway=maze(row,col+1,m,n);
         int down=maze(row+1,col,m,n);
         return rigthway+down;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter row :");
    int m = sc.nextInt();
    System.out.println("enter column:");
    int n=sc.nextInt();
    System.out.println(maze(1,1,m,n));
}
}

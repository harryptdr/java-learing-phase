package twodimensionalaray;

public class sumandmax {
    public static void main(String[] args) {
        int[][]arr={{3,2,1},{6,5,4},{8,7,9}};
        int mx=Integer.MIN_VALUE;
        int sum=0;
        int m=arr.length;
        int n=arr[0].length;
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum=sum+arr[i][j];
                mx=Math.max(mx,arr[i][j]);
            }
        }
    }
}

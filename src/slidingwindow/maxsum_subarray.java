package slidingwindow;

public class maxsum_subarray {
    public static void main(String[] args) {
        int[] arr={3,4,5,2,3,6,7};
        int k=3;
        int n=arr.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        int i=0;
        int j=0;
        while(j<n){
            sum=sum+arr[j];
            if(j-i+1<k){
                j++;
            }
             else if(j-i+1==k){
                max=Math.max(max,sum);
                sum=sum-arr[i];
                i++;
                j++;
            }
        }
        System.out.println(max);
    }
}

package slidingwindow;

public class minimum_sum {
    public static void main(String[] args) {
        int [] arr={2,3,5,3,2,1,6,5,1,1};
        int k=2;
        int sum=0;
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        int i=0,j=0;
        while(j<n){
            sum=sum+arr[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                min=Math.min(min,sum);
                sum=sum-arr[i];
                i++;
                j++;
            }
        }
        System.out.println(min);
    }
}

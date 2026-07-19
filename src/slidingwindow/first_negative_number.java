package slidingwindow;

public class first_negative_number {
    public static void main(String[] args) {
        int [] arr= {2,-1,3,-4,5,-7,8,9};
        int n=arr.length;
        int k=3;
        int i=0 , j=0;
        int [] ans=new int[n-k+1];
        while(j<n){
            if (j-i+1<k) {
              if(arr[j]<0){
                  ans[i]=arr[j];
                  j++;
                  i++;
              }else {
                  j++;
              }
            }
            else if(j-i+1==k){
                if(arr[j]<0){
                    ans[i]=arr[j];
                    i++;
                    j++;
                }else{
                    ans[i]=0;
                    i++;
                    j++;
                }
            }
        }
        for(int l=0;l< ans.length;l++){
            System.out.print(ans[l]+" ");
        }
    }
}

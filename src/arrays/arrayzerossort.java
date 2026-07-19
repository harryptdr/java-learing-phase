package arrays;

public class arrayzerossort {
    public static void main(String[] args) {
        int[] arr={0,1,0,1,0,1,1,0,0,1};
        int n=arr.length;
        int res=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) {
                 res++;
            }
        }
        for(int i=0;i<n;i++) {
            if (i < res) {
                arr[i] = 0;
            } else arr[i] = 1;
        }
        for(int ele:arr) {
            System.out.print(ele+ " ");
        }
    }
}

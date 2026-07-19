package arrays;

public class rollnumber {
    public static void main(String[] args) {
        int[] arr={10,56,78,34,38,23,33};
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<35){
                System.out.print(i+" ");
            }
        }

    }
}

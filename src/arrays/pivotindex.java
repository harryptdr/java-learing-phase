package arrays;

public class pivotindex {
    public static void main(String[] args) {
        int[] arr={1,7,3,6,5,6};
        int totalsum=0;
        for(int i=0;i<arr.length;i++){
            totalsum=totalsum+arr[i];
        }
        int leftsum=0;
        for(int i=0;i<arr.length;i++){
            if(leftsum==totalsum-leftsum-arr[i]){
                System.out.println(i);
            }
            leftsum=leftsum+arr[i];
        }
    }
}

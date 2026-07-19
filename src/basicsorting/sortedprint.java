package basicsorting;

public class sortedprint {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr={12,14,33,53,1};
        print(arr);
        int n=arr.length;
        for(int j=0;j<n-1;j++) {
            for (int i = 0; i < n-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        print(arr);
    }
}

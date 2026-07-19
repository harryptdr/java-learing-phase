package basicsorting;

public class bubblesort2 {
    public static void print(int []arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {23, 45, 2, 3, 26, 78};
        int n = arr.length;
        print(arr);
        for (int x = 0; x < n - 1; x++) {//no of operation kam ho jayenge n-1-x se
            for (int i = 0; i < n - 1 - x; i++) {
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

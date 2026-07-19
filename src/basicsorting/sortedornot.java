package basicsorting;

public class sortedornot {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean flag=true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag=false;
                break;
            }
        }
        if (flag==true) {
            System.out.println("array is sorted");
        }else{
            System.out.println("array is not sorted");
        }
    }
}

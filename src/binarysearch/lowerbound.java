package binarysearch;

public class lowerbound {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int n = arr.length;
        int target = 5;
        int lowerbound = n;
        int lo = 0;
        int hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= target) {
                lowerbound = Math.min(lowerbound, mid);
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        System.out.println(lowerbound);
    }
}
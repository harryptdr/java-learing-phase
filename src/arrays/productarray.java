package arrays;

public class productarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7};
        int r=1;
        for(int i=0;i<arr.length;i++){
            r=r*arr[i];
        }
        System.out.println(r);
    }
}

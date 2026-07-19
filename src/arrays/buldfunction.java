package arrays;
import java.util.Arrays;
public class buldfunction {
    public static void main(String[] args) {
        int[] arr={34,54,56,76,32,23,46,70};
        for(int x: arr){
            System.out.print(x+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
}

package arrayprecticequestion;
import java.util.Arrays;
public class question6 {
    public static void main(String[] args) {
        int [] arr={34,2,56,4,1,40,89,3};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]+" "+arr[arr.length-2]+" "+arr[arr.length-3]);
    }
}

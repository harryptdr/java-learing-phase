package arrayprecticequestion;

public class question5 {
    public static void main(String[] args) {
        int[]arr={12,15,34,46,5,70,16};
        int n=31;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>n){
                count++;
            }
        }
        System.out.println(count);
    }
}

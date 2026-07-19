package arrayprecticequestion;

public class question4 {
    public static void main(String[] args) {
        int[] arr={2,1,1,3,4,5};
        int n=0;
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    n=arr[i];
                }
            }
        }
        System.out.println(n);
    }
}

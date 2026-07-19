package arrayprecticequestion;

public class question7 {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,4};
        boolean x=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[i+1]){
                    x=true;
            }
            else {
                x=false;
                break;
            }
        }
        System.out.println("sorted");
    }
}

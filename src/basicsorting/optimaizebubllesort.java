package basicsorting;

public class optimaizebubllesort {
    public static void print(int[]arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={2,4,66,5,3,2};
        print(arr);
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            boolean flage=true;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    flage=false;
                    break;
                }
            }
            if(flage==true)break;
        }
        print(arr);
    }
}

package quicksort.java;

public class personal {
    public static void print(int[] arr){
        for (int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partion(int[] arr,int fisrt,int last){
        int pivot=arr[last];
        int i=fisrt-1;
        for(int j=fisrt;j<last-1;j++){
            if(arr[j]<pivot){
                i=i+1;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,arr[last]);
        return i+1;
    }
    public static void quick(int []arr,int fisrt,int last){
            if(fisrt>last)return;
        if(fisrt<last){
            int p=partion(arr,fisrt,last);
            quick(arr,fisrt,p-1);
            quick(arr,p+1,last);

        }
    }
    public static void main(String[] args) {
        int [] arr={7,3,54,32,34};
        int n=arr.length;
        quick(arr,0,n);
        print(arr);
    }
}

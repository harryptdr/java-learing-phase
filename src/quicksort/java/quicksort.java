package quicksort.java;

public class quicksort {
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int partion(int [] arr,int lo,int hi){
        int pivot=arr[lo],pivotindex=lo;
        int smallcount=0;
        for(int i=lo+1;i<=hi;i++){
            if(arr[i]<=pivot)smallcount++;
        }
        int correctindx=pivotindex+smallcount;
        swap(arr,pivotindex,correctindx);
        int i=lo,j=hi;
        while(i<correctindx&&j>correctindx){
            if(arr[i]<=pivot)i++;
            else if(arr[i]>pivot)j--;
            else if(arr[i]>pivot&&arr[j]<=pivot){
                swap(arr,i,j);
            }
        }
        return correctindx;
    }
    public static void quick(int[] arr,int lo,int hi){
        if(lo>=hi)return;
        //pivot ko shi jgh rkho
        //and left side <=arr[lo] element ko rkho
        int idx=partion(arr,lo,hi);
        quick(arr,lo,idx-1);
        quick(arr,idx+1,hi);
    }
    public static void main(String[] args) {
        int[] arr={89,12,34,32,21,1,2,6,3,45,5};
        print(arr);
        int n=arr.length;
        quick(arr,0,n-1);
        print(arr);
    }
}

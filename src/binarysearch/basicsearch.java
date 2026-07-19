package binarysearch;

public class basicsearch {
    public static void main (String args[]){
        int arr[]={10,11,13,14,15,16,17,18};
        boolean falg=false;
        int target=19;
        int lo=0;
        int n=arr.length;
        int hi=n-1;
        while(lo<hi){
            int mid=(lo+hi)/2;
            if (arr[mid]<target){
                //go rigth
                lo=mid+1;
            }
            else if(arr[mid]>target){
                //go left
                hi=mid-1;
            }
            else{
                falg=true;
                break;
            }
        }
        if(falg==true){
            System.out.println("target is found");
        }
        else{
            System.out.println("target is not found");
        }

    }
}

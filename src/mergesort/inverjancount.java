package mergesort;


import loops.count;

public class inverjancount {
    static int count =0;
    public static void inversion(int [] a,int [] b){
        int i=0;
        int j=0;
        while(i<a.length&&j<b.length){
            if (a[i] > b[j]) {
                count+=(a.length-i);
            }
        }
    }
    public static void merge(int [] a,int [] b, int [] arr) {
        int i=0;int j=0; int k=0;
        while(i<a.length&&j<b.length){
            if(a[i]<=b[j]) arr[k++]=a[i++];
            else arr[k++]=b[j++];
        }
        while(i<a.length){
            arr[k++]=a[i++];
        }
        while(j<b.length){
            arr[k++]=b[j++];
        }
    }
    public static void mergsort(int []arr){
        int n=arr.length;
        if(n==1)return;//base case
        //create two arrays of n/2 size
        int [] a=new int[n/2];
        int [] b =new int [n-n/2];
        //copy pasting
        for(int i=0;i<n/2;i++)a[i]=arr[i];
        for(int i=0;i<n-n/2;i++)b[i]=arr[i+n/2];
        //magic
        mergsort(a);
        mergsort(b);
        inversion(a,b);
        merge(a,b,arr);
    }
    public static void main(String[] args) {
        int [] arr={8,2,5,3,1,4};
        int count=0;
        mergsort(arr);
        System.out.println(count);
    }
}

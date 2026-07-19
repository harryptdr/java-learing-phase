package basicsorting;

public class selectionsort {
    public static void main(String[] args) {
        int [] arr= {1,2,-11,39,-8,-9,5};
        int n=arr.length;
        for(int x=0;x<n-1;x++){
            int min=Integer.MAX_VALUE;
            int mindex=-1;
            for(int i=x;i<n;i++){
                if(arr[i]<min){
                    min=arr[i];
                    mindex=i;
                }
            }
            int temp=arr[x];
            arr[x]=arr[mindex];
            arr[mindex]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }

    }
}

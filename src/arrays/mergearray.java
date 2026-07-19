package arrays;

public class mergearray {
    public static void main(String[] args) {
        int[] a={10,23,45,67,89};
        int[] b={11,22,44,57,59};
        int n=a.length;
        int m=b.length;
        int[]c=new int[n+m];
        int i=0,j=0,k=0;
        while(i<m&&j<n) {
            if (a[i] > b[j]) {
                c[k] = b[j];
                j++;
                k++;
            } else {
                c[k] = a[i];
                i++;
                k++;
            }
        }
        if(i==m){//ab b aaray ke element ko c me dalenge
            while(j<n){
                c[k]=b[j];
                j++;
                k++;
            }
        }
        if(j==n){ // ab a array ke element ko c ,me dalenge
            while(i<m){
                c[k]=a[i];
                i++;
                k++;
            }
        }
        for(int ele:c){
            System.out.print(ele+" ");
        }
    }
}

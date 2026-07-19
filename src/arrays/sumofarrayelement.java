package arrays;

public class sumofarrayelement {
    public static void main(String[] args) {
        int sum=0;
        int[] arr={10,20,30,40,50,60,70,80,90};
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}

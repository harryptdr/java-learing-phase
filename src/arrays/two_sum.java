package arrays;

public class two_sum {
    public static void main(String[] args) {
        int [] arr= {2,7,11,15};
        int target = 9;
        int n= arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==target){
                System.out.print(i+1+" ");
                System.out.print(j+1);
                break;
            }
            else if(sum>target){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("not found");
    }
}

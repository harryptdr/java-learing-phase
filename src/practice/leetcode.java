package practice;

public class leetcode {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,40,60,70};
        int n=arr.length;
        int target=40;
        int[] nums=new int[2];
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                nums[i]=+i;
            }else{
                nums[0]=-1;
                nums[1]=-1;
                break;
            }
        }
        System.out.println(nums);
    }
}

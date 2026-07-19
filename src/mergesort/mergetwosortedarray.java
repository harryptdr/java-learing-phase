package mergesort;

public class mergetwosortedarray {
    public static void merge(int[] nums ,int[] arr,int[] merg){
        int i=0;int j=0;int k=0;
        while(i<nums.length&&j<arr.length){
            if (nums[i]<=arr[j]){
                merg[k]=nums[i];
                k++;
                i++;
            }else{
                merg[k]=arr[j];
                k++;
                j++;
            }
        }
        while(i<nums.length){
            merg[k]=nums[i];
            k++;
            i++;
        }
        while(j<arr.length){
            merg[k]=arr[j];
            k++;
            j++;
        }
        for(int ele:merg){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int [] nums={167,2,3,774,5,6};
        int [] arr={12,13,14,515,16};
        int[] merg=new int [nums.length+arr.length];
        merge(nums,arr,merg);

    }
}

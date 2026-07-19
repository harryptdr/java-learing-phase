package arrays;

public class secondlargest {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 8, 9};
        int firstmax=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>firstmax) {
                firstmax = arr[i];
            }
        }
        arr[0]=firstmax;
        System.out.println(firstmax);
       int secondmax=arr[1];
        for(int i=2;i<arr.length;i++){
          if(arr[i]>secondmax){
              secondmax=arr[i];
           }
        }
        System.out.println(secondmax);
    }
}

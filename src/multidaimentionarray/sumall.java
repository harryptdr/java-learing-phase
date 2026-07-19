package multidaimentionarray;

public class sumall {
    public static void main(String[] args) {
        int [][] arr={{1,2,13,4},{7,-98,9,10}};
        int max=Integer.MIN_VALUE;
        int  m= arr.length;
        int n=arr[0].length;
        //maximum
       for (int i = 0; i <m ; i++) {
           for (int j = 0; j < n; j++) {
               if(arr[i][j]>max){
                    max=arr[i][j];
               }
           }
        }
        System.out.println(max);
        //minimum
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <m ; i++) {
         for (int j = 0; j < n; j++) {
             if(arr[i][j]<min){
             min=arr[i][j];
               }
           }
       }
        System.out.println(min);

    }
}

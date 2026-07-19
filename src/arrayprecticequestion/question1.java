package arrayprecticequestion;

public class question1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //calculate product
        int product=calculateproduct(arr);
        System.out.println(product);
    }
    public static int calculateproduct(int[] arr){
        int product=1;
        for(int i=0;i<arr.length;i++){
            product=product*arr[i];
        }
        return product;
    }

}

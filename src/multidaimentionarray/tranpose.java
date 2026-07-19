package multidaimentionarray;

public class tranpose {
    public static void swap(int i,int j){
        int temp=i;
        i=j;
        j=temp;
    }
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
//        int [][] ts= new int [arr.length][arr[0].length];
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                ts[i][j]=arr[j][i];
//            }
//        }
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                System.out.print(ts[i][j]+" ");
//            }
//            System.out.println();
//        }
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                //arr[i][j]=swap(arr[i][j],arr[j][i]);
            }
        }
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

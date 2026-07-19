package twodimensionalaray;

public class rowwiseprintting {
    public static void main(String [] args){
        int[][] arr={{1,2},{4,3},{5,6}};

        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

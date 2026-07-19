package arraylist;

import java.util.ArrayList;

public class arraylistcreation {
    public static void main(String[] args) {
        ArrayList<Integer> hp=new ArrayList<>();
        hp.add(2);
        hp.add(3);
        hp.add(4);
        hp.add(3,45);
        hp.add(4,89);
        hp.add(5,45);
        hp.add(6,34);
         int n=hp.size();
         int max=Integer.MIN_VALUE;
         for(int i=0;i<n;i++){//maximum
             if(max<hp.get(i)){
                 max=hp.get(i);
             }
         }
         for(int i=n-1;i>=0;i--){//reverse
             System.out.print(" " +hp.get(i));
         }
        System.out.println("maxmimum value"+max);
        //swap of two number
        hp.set(1,hp.get(3));
        hp.set(3,hp.get(1));
        System.out.println(hp);
    }
}

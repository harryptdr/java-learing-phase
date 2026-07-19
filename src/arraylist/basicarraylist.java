package arraylist;

import java.util.ArrayList;

public class basicarraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(5);
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        System.out.println(arr);
        arr.set(3,67);
        System.out.println(arr);
        System.out.println(arr.size());
        arr.add(56);
        arr.add(96);
        System.out.println(arr);
        System.out.println(arr.size());


    }
}

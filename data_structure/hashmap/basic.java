package hashmap;

import java.util.HashSet;

public class basic {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<Integer>();
        //hashset insertion is 0(1) time complexity
        set.add(200);
        set.add(10);
        set.add(40);
        set.add(50);
        System.out.println(set);
        //hashset is print through set is random order

        //Size of hashset is 0(1) time complexity
        System.out.println(set.size());

        // searching of hashset is 0(1) time complexity
        System.out.println(set.contains(30));//contains always return boolean values true/false

        //remove in hashset is 0(1) complexity
        System.out.println(set.remove(40));//if element dose not exits in hashset then does not error

        System.out.println(set);

        // hashset does not consider a index print vai loop always use for each loop

        for(int ele: set){
            System.out.print(ele+" ");
        }
    }
}

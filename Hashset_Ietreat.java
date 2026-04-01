package hashmap;

import java.util.HashSet;

public class Hashset_Ietreat {
    public static void main(String[] args) {
        HashSet<Integer> s=new HashSet<>();
        s.add(20);
        s.add(20);// we are adding in set two time of 20 but set will consider only one time
        System.out.println(s);
    }
}

package hashset;
import java.util.*;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(5);
        hs.add(6);
        hs.add(7);
        System.out.println(hs);

        if(hs.contains(6)){
            System.out.println("number is present");
        }
    }
}

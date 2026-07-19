package hashset;
import java.util.*;
public class charecter {
    public static void main(String[] args) {
        HashSet<Character> hs=new HashSet<>();
        hs.add('a');
        hs.add('b');
        hs.add('f');
        hs.add('e');
        hs.add('d');
        hs.add('c');
        System.out.println(hs);

        if(hs.contains('a')){
            System.out.println("this charector is present");
        }
    }
}

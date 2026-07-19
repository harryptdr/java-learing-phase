package hashset;
import java.util.*;
public class longest_substring_reating {
    public static void main(String[] args) {
        String str="abcade";
        int n=str.length();
        HashSet<Character> hs= new HashSet<>();
        int i=0,j=0;
        int max=0;
        while(j<n){
            if(!hs.contains(str.charAt(j))){
                hs.add(str.charAt(j));
                max=Math.max(max,j-i+1);
                j++;
            }else{
                hs.remove(str.charAt(i));
                i++;
                j++;
            }
        }
        System.out.println(max);
    }
}

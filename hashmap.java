package hashmap;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> set= new HashMap<>();
        //put method is insertion in map
        set.put("hariom",34);
        set.put("ram",54);
        set.put("shyam",78);
        set.put("anjali",67);
        set.put("rohit",64);
        System.out.println(set);

        //get method indiual value return
        System.out.println(set.get("rohit"));

        //contains always return true and false value

        System.out.println(set.containsKey("anjali"));
        System.out.println(set.containsKey("rosan"));

        //size of map
        System.out.println(set.size());

        //remove the key and value both of them using key

        System.out.println(set.remove("shyam"));
        System.out.println(set);


    }
}

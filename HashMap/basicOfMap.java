import java.util.*;
import java.util.HashMap;

public class basicOfMap {
    public static void main(String[] args) {

        //always in the hashMap the printing will happen in random but if you want to maintain the insertion order us LinkedHashMap....
        HashMap<String, Integer> n = new HashMap<>();
        n.put("Indian", 1);
        n.put("Pakistan", 1);
        n.put("Russia", 1);
        for (Map.Entry<String, Integer> entry : n.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }

}

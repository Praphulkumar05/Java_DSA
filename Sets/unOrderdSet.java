import java.util.*;

public class unOrderdSet {
    public static void main(String[] args) {
        // Set<Integer> s = new TreeSet<>();
        // HashSet<Integer> set = new HashSet<>();
        // set.add(3);
        // set.add(1);
        // set.add(2);
        // System.out.println(set);

        // HashMap<Integer, Integer> m1 = new HashMap<>();

        // m1.put(2, 20);
        // m1.put(1, 30);
        // m1.put(3, 10);
        // for (int x : m1.keySet()) {
        //     System.out.print(x + " ");
        //     System.out.println(m1.get(x));
        // }
        // System.out.println();
        // s.add(5);
        // s.add(1);
        // s.add(2);
        // System.out.println(s);

        //In ordered map the sorted version will follw the key to sort the output not the value it will sort only the key .


        HashMap <String,Integer> m2 = new HashMap<>();
        //In String type of key the sorting is follwed by the value not on the bases of key.
        m2.put("System",10);
        m2.put("Kumar",1);
        m2.put("Ji",999);
        for(String ele:m2.keySet()){
            //System.out.println(ele+" "+m2.get(ele));
            System.out.println(ele);



            //51.01


            
 
        }

    }

}

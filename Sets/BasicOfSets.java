import java.util.*;

public class BasicOfSets {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(1);   //adding the ele from the set.
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(4);
        s.remove(1);  //removeing the ele from the set
        int target = 3;
        if (s.contains(target)) {
            System.out.println("Found"); ///// searching the ele in the set
        } else {
            System.out.println("not found");
        }

        System.out.println("Elements are: " + s);
        System.out.println("Size: " + s.size());  ////for finding the size of the set  

    }

}

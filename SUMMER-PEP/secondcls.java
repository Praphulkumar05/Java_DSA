import java.util.*;

public class secondcls {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1000, "Tracker");
        map.put(100, "Student");
        map.put(101, "Student2");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        for (int ele : map.keySet()) {
            System.out.println(ele);
        }

    }
    
}

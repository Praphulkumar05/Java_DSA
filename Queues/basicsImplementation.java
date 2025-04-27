import java.util.LinkedList;
import java.util.*;

public class basicsImplementation {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> p = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        while(q.size()!=0){
            System.out.print(q.peek()+" ");
            p.add(q.remove());

        }
        System.out.println();
       while(p.size()!=0){
        System.out.print(p.peek()+" ");
        q.add(p.remove());
       }

       

       
    }
    
}

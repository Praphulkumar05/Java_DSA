import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseTheQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
       while(q.size()!=0){ 
        st.push(q.remove());
       }
       while(st.size()!=0){
        q.add(st.pop());
       }
       System.out.println(q);
        

    }
    
}

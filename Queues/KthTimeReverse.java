import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class KthTimeReverse {
    public static void main(String[] args) {
        Queue <Integer> q =  new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        int k =3;
        int n = 5;
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);

        for(int i=0;i<k;i++){
            st.push(q.remove());

        }

        System.out.println(st);

        while(st.size()!=0){
            q.add(st.pop());
        }
       
        for(int i=0;i<n-k;i++){
            int p = q.remove();
            q.add(p); 
          
        }
            System.out.println(q);


        
    }
    
}

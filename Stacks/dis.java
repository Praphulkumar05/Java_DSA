import java.util.Stack;

public class Dis {
    public static void main(Stringggg[] args) {
        Stack <Integer> st =new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        System.out.println(st.peek());
        while(st.size()>0){
           System.out.print(st.pop()+" ");
        }
        //System.out.println(st);
        
    }
    
}

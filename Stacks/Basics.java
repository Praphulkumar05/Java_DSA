import java.util.Stack;

public class Basics {
    public static void main(Stringggg[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        // System.out.println(st);
        // System.out.println(st.size());
        // st.pop();
        // System.out.println(st);
        // // System.out.println(st.size());.
        // while(st.size()>2){
        // st.pop();
        // }
     System.out.println(st);
        // System.out.println(st.size());
        // System.out.println(st);

        // Stack<Integer> rt = new Stack<>();
        // while (st.size() > 0) {
        //     int x = st.peek();


        //     // method to reverse the stack...
        //     rt.push(st.pop());
        //     // rt.push(x);
        //     // st.pop();

        // }
        // System.out.println(rt);

        Stack <Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());

        }
        System.out.println(rt);
        Stack <Integer> pt = new Stack<>();
        while(rt.size()>0){
        pt.push(rt.pop());

        }
        System.out.println(pt);


    }

}

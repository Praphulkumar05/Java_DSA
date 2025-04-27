import java.util.Stack;

public class MinStack {
    public static int getMin(int arr[]) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        Stack<Integer> min = new Stack<>();
        st.push(arr[0]);
        min.push(arr[0]);
        for (int i = 1; i < n; i++) {
            if (min.peek() < arr[i]) {
                min.push(min.peek());
            } else {
                min.push(arr[i]);
            }
            st.push(arr[i]);

        }
        st.pop();
        min.pop();
        System.out.println(st.peek());     // incomplete code
        return min.peek();

    }

    public static void main(String[] args) {
        int arr[] = {7,8,5,6,3,4};
        int ans = getMin(arr);
        System.out.println(ans);


    }
}
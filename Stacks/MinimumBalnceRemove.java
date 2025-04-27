import java.util.*;

public class MinimumBalnceRemove {
    public static int isRemove(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        int numberRemove = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                if (st.size() > 0) {
                    st.pop();
                } else {
                    numberRemove++;
                }

            }
        }
        numberRemove += st.size();
        return numberRemove;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        int result = isRemove(str);
        System.out.println(result + " number need to be remove: ");

    }

}

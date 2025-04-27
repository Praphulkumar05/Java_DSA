import java.util.Stack;

public class RemoveDuplicateElement {
    public static void Remove(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(st.size()==0||st.peek()!=str.charAt(i)){
                st.push(str.charAt(i));
            }
           
        }
        StringBuilder gtr = new StringBuilder();
        while(st.size()!=0){
           gtr.append(st.pop());
        }
         System.out.println(gtr.reverse());
    
    }
    public static void main(String[] args) {
        String str = "aaabbcddaabffg";
        Remove(str);
        
    }
    
}

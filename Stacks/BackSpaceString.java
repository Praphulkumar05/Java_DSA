import java.util.Stack;

public class BackSpaceString {
    public static boolean Compare(String s,String t){
        return process(s).equals(process(t));
    }
    public static String process(String str){
        Stack<Character> p = new Stack<>();
        int n = str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch=='#'){
                if(p.size()!=0){
                    p.pop();
                }
            }else{
                p.push(ch);
            }
        }
        StringBuilder gtr = new StringBuilder();
        while(p.size()!=0){
            gtr.append(p.pop());
        }
        return gtr.reverse().toString();
       
    }
  
    public static void main(String[] args) {
        String s = "xywrrmp";
        String t ="xywrrmu#p";
        System.out.println(Compare(s, t));


     
    
       
    }
    
}

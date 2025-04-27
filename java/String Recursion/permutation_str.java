public class permutation_str {
    void per(String ans,String ori){
        if (ori.equals("")) {
            System.out.println(ans);
            return;
        }
        
        for(int i=0;i<ori.length();i++){
            char ch=ori.charAt(i);
            String left = ori.substring(0, i);
            String right = ori.substring(i + 1);

            per(ans+ch,left+right);

        }
    }
    public static void main(String[] args) {
        String str="abcde";
        permutation_str s=new permutation_str();
        s.per("", str);

        
    }
    
}

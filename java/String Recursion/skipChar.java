public class skipChar {
    // void skip(String ans, String original){ //// this method is more taking the space.
    //     if(original.length()==0){
    //         System.out.println(ans);
    //         return;
    //     }
    //     char ch=original.charAt(0);
    //     if(ch=='p')skip(ans, original.substring(1));
    //     else skip(ans+ch, original.substring(1));
    // }
    void skip(String ans, String original,int idx){ //// this method is less taking the space.
        if(idx==original.length()){
            System.out.println(ans);
            return;
        }
        char ch=original.charAt(idx);
        if(ch=='p')skip(ans, original,idx+1);
        else skip(ans+ch, original,idx+1);
    }
    public static void main(String[] args) {
        String str="praphul";
        skipChar s=new skipChar();
      
        s.skip("", str,0);
        
    }
    
}

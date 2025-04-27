//without repetation of the string
public class Subsetlc {

    void sub(String ans,String ori,int idx){
        if(idx==ori.length())
        
         {
           
        System.out.println(ans);
        return;
        }
        char ch=ori.charAt(idx);
        sub(ans+ch, ori, idx+1);
        sub(ans, ori, idx+1);
       
        

    }
    public static void main(String[] args) {
        String str="abc";
        Subsetlc s=new Subsetlc();
        System.out.println("All the possible subsets are: ");
        s.sub("", str, 0);
        
    }
    
}

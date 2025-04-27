import java.util.*;

public class subsets {
    void sub(String ans,String ori,int idx){
        if(idx==ori.length()){
            System.out.println(ans);
            return;
        }
        char ch=ori.charAt(idx);
        sub(ans+ch, ori, idx+1);
        sub(ans, ori, idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");

        String ori=sc.nextLine();
        subsets s=new subsets();
        s.sub("", ori, 0);

        
    }
    
}

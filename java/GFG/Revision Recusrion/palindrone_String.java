
import java.util.*;
public class palindrone_String {
    Boolean palind(String s,int i,int j){
        if(i>j)return true;
        if(s.charAt(i)!=s.charAt(j)) return false;
         else return  palind(s, i+1, j-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        palindrone_String k=new palindrone_String();
        if(k.palind(s, 0, s.length()-1)){
            System.out.println("Is palin");
        }else{
            System.out.println("No ");
        }

        
    }
    
}

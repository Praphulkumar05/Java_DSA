import java.util.*;
public class Q4 {
    public static void main(Stringggg[] args) {
        int n =373;
        int ori=n;
        int count=0;
        while(n>0){ 
            int ld=n%10;
            n=n/10;
            if( ld!=0&&ori%ld==0){
                count++;
            }


        }
        System.out.println(count);
        
        
    }
    
}

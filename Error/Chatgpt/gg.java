
import java.util.*;
public class gg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int s=0;
        while(a>0){
            int l=a%10;
            s=s+l;
            a=a/10;
        }
        System.out.println("Sum will  be: "+s);
    
    }
    
}

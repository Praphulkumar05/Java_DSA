
import java.util.*;
public class Q2 {
    public static void Sum(int n){
        int sumOfeven=0;
        int sumOFodd=0;
        while(n>0){
            if(n%2==0){
                sumOfeven=sumOfeven+n;
            }else if (n%2!=0){
                sumOFodd =sumOFodd+n;
            }
            n--;
        }
        System.out.println("Sum of Even: "+ sumOfeven);
        System.out.println("Sum of Odd: "+sumOFodd);
    }
    public static void main(Stringggg[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        Sum(n);
        
    }
    
}

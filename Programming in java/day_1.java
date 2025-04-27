import java.util.*;

       
public class day_1 {
    public static void SumOfeven(int n){
        int sum=0;
        while(n>0){
            if(n%2==0){
                sum=sum+n;
            }
            n--;
           
            
           
        }
        System.out.println(sum);

            
    }

    public static void Power(int a,int b){
        double re= Math.pow(a, b);
        
        int so=(int)re;
        System.out.println(so);
    }
    public static void main(Stringggg[] args) {
        Scanner sc= new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       Power(a, b);

       
    
}
    
}

import java.util.*;
public class fibonacci {
    int fibo(int a){
        if(a==1||a==2){
            return 1;
        }
        return  fibo(a-1)+fibo(a-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth term");
        int a=sc.nextInt();
        fibonacci p=new fibonacci();
       int r= p.fibo(a);
       System.out.println(r);


    }
    
}

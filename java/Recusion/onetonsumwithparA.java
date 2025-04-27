import java.util.*;
public class onetonsumwithparA {
    void sum(int s,int n){
        if(n==0){
            System.out.println(s);
            return;
        }
        sum(s+n, n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int s=0;
        onetonsumwithparA p=new onetonsumwithparA();
        p.sum(s, n);
        
    }
    
}

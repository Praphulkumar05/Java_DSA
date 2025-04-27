import java.util.*;
public class oneton{
    void print(int n){
        if(n==0) return;
       
        print(n-1);
        System.out.println(n);
       
        


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n");
        int n=sc.nextInt();
        oneton p=new oneton();
        p.print(n);
        
        
        
        
    }
}
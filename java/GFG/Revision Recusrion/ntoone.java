

import java.util.*;
public class ntoone{
    void printp(int n,int s){
        
        if(n==0) {
            System.out.println(s);
            return;
        }
        
       
        printp(n-1,s+n);
        // System.out.println(s);
       
        


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n");
        int n=sc.nextInt();
        ntoone p=new ntoone();
        p.printp(n,0);
        
        
        
        
    }
}
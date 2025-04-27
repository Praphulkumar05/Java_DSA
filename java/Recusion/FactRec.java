// package Recusion;
import java.util.*;

public class FactRec {
    int fact(int a){
        int fact=1;
        if(a==0|| a==1) return 1;
        return a*fact(a-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        FactRec O= new FactRec();
        System.out.println(O.fact(a));
        
    }
    
}

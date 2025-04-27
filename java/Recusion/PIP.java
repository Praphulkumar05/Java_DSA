
import java.util.*;
public class PIP {
    void pip(int n){
        if(n==0) return ;
        System.out.print(n);
        pip(n-1);
        System.out.print(n);
        pip(n-1);
        System.out.print(n);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        System.out.println();
        PIP p=new PIP();
        p.pip(n);
        
    }
    
}

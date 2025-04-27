import java.util.*;
public class trailrecusrion {
    void print(int n){
        if(n<0){
            return;
        }
        print(n-1);
        System.out.println(" "+n);
        //print(n-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        trailrecusrion p=new trailrecusrion();
        p.print(n);
        
    }
    
}

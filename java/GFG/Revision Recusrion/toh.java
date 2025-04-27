
import java.util.*;
public class toh {
    void towerofhanoi(int n,char from_rod,char to_rod,char aux_rod){
        if(n==0){
            return;
        }
        towerofhanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk "+n+" from rod "+from_rod+" to rod "+to_rod);
        towerofhanoi(n-1, aux_rod, to_rod, from_rod);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();     
        toh t=new toh();
        t.towerofhanoi(n, 'A', 'C', 'B');
        
        
    }
    
}

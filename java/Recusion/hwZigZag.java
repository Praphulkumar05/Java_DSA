import java.util.*;
public class hwZigZag {
    void zing(int n){
        if(n==0) return;
        System.out.print(n+" ");
        zing(n-1);
        System.out.print(n+" ");
        zing(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        hwZigZag h=new hwZigZag();
        h.zing(n);
    }
    
}

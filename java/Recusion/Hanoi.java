import java.util.*;
public class Hanoi {
    void hanoi(int n,char a,char b,char c){
        if(n==0)return;
        hanoi(n-1, a, c ,b);
        System.out.println(a+"->"+c);
        hanoi(n-1,b,a,c);

 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        Hanoi h= new Hanoi();
        h.hanoi(n,'A','B','C');
        
    }
    
}

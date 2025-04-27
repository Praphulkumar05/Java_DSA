import java.util.*;
public class oneton{
    void print(int i,int a){
        if(i>a)return;
        System.out.println(i);
        print(i+1, a);
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        int i=1;
        oneton p=new oneton();
       p.print(i, a);

    }
    
}
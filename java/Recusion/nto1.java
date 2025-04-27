import java.util.Scanner;
public class nto1 {
    void number(int a){
        if(a==0) return ;
        System.out.println(a);
        number(a-1);
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        nto1 p=new nto1();
        p.number(a);
    }
    
} 

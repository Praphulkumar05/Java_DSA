import java.util.*;
public class onetonwithoutextraparaa {
    void print(int a){
        int sum=0;
        if(a==0)return ;
        print(a-1);
        System.out.println(a);
        
     

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt(); 
        onetonwithoutextraparaa p=new onetonwithoutextraparaa();
        p.print(a);   
    }
    
}

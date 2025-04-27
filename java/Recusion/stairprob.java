import java.util.*;
public class stairprob {
    int s(int x){
        if(x==1)return 1;
        if(x==2)return 2;
        if(x==3)return 3;
        return s(x-1)+s(x-2)+s(x-3);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int x=sc.nextInt();
        stairprob m=new stairprob();
        int r=m.s(x);
        System.out.println("the total number of possibility is: "+r);
    
    }
    
}

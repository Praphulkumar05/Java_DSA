import java.util.*;
public class onetonsumwithoutpara {
    int sum(int a){
        int s=0;
        if(a==0|| a==1)return 1;
        return a+sum(a-1);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a =sc.nextInt();
        onetonsumwithoutpara p=new onetonsumwithoutpara();
        int r=p.sum(a);
        System.out.println(r);

        
    }
    
}

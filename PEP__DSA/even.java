import java.util.*;

public class even {


    public static boolean fun1(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
        
    }

    public static boolean fun2(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean fun3(int n){
        return (n&1)==0; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            // System.out.println("number is : " +i+" "+ fun1(i));
           // System.out.println("number is : " +i+" "+ fun2(i));
            System.out.println("number is : " +i+" "+ fun3(i));
        }


    }
}
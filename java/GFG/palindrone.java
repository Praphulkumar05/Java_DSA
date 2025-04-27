import java.util.Scanner;;
public class palindrone {
        boolean isPalindrone(int a){
           // int a=12;
            int original =a;
            int rev=0;
            while(original>0){
                int ld=original%10;
                rev=rev*10+ld;
                original=original/10;
            

            }
            return a==rev;
        
        }
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number ");
            palindrone pc=new palindrone();
            int a=sc.nextInt();
            boolean result=pc.isPalindrone(a);
            if(result){
                System.out.println(result+" Is a palindrone");
            }else{
                System.out.println("Is not a palindrone");
            }
            
        
        }
        
    }

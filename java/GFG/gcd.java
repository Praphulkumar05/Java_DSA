import java.util.Scanner;

public class gcd {
    int gcd(int a,int b){
        while(a!=b){
            if(a>b){
                a=a-b;

            }else{
                b=b-a;
            }
           
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        gcd g=new gcd();
        int result=g.gcd(a, b);
        System.out.println("The result is: "+result);
        
        }

        
    }
    


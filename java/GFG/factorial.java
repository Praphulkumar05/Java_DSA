import java.util.Scanner;
public class factorial {
    int fact(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;

        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        factorial f = new factorial();
        int result=f.fact(a);
        System.out.println("Factorial"+result);






        
    }
    
}

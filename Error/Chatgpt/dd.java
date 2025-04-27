import java.util.*;

public class dd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a =sc.nextInt();
        int fact=1;
        int sum=0;
        while(a>0){
            fact=fact*a;
            sum=sum+a;
            a--;
        }
        System.out.println("Factorial is : "+fact);
        System.out.println("Sum will be: "+sum);
    }
    
}

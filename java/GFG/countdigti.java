import java.util.Scanner;
public class countdigti {
    int count(int a){
        int count =0;
        while(a>0){
            a=a/10;
            count++;
    }
    return count;


    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        //System.out.println("Enter the number ");
        countdigti s=new countdigti();
        int call =s.count(a);
        System.out.println("The count of the number is "+ call);




      
        

    }
    
}

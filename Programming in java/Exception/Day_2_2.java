import java.util.*;
class NegativeNumberFormat extends Exception{
    public String toString(){
        return "Invalid number";
    }
    public String getMessage(){
        return "Enter the vallid String";

    }
}
public class Day_2_2 {

    public static void sum(int a,int b)throws NegativeNumberFormat{
        
        if(a<0||b<0){
            throw new NegativeNumberFormat();
        }else {
            int sum=a+b;
            System.out.println("sum will be "+sum);

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        try{
            sum(a, b);
           // System.out.println("Sum will be: "+sum);
        }catch(Exception e){
            System.out.println(e);
        }
        

        
    }
    
}

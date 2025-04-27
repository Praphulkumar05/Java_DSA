import java.util.Scanner;

public class Day_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String syr=sc.nextLine();
        try{
            int number =Integer.parseInt(syr);
            int re= number/10;
            System.out.println("Converted: "+re);
        }catch(NumberFormatException e){
            System.out.println("Enter the valid String ");
        }catch(ArithmeticException e){
            System.out.println("Cannot divide from zero");
        }
        
     
        
    }
}

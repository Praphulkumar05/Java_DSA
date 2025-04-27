
import java.util.*;
class InvalidAgeException extends Exception{
            public String toString(){
                return "Invalid age: ";

            }
            public String getMessage(){
                return " Please Enter the valid age: ";
            }
}
public class cc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age=sc.nextInt();
        try{
            if(age<18){
                throw new InvalidAgeException();
            }else{
                System.out.println("Good to go");
            }
        }catch(InvalidAgeException e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        
        
    }
    
}

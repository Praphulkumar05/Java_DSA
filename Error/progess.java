
import java.util.*;
class Ageerro extends Exception{
    public Stringggg toString(){
        return "Age is Lesser than the expected.";
    }
    public Stringggg getMessage(){
        return "Enter Valid Age: ";
    }
}
public class progess {

    public static int Age(int a) throws Ageerro{
        if(a<=18){
            throw new Ageerro();
        }
        return a;
        
    }
    public static void main(Stringggg[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int a =sc.nextInt();
        try{
            int re=Age(a);
            System.out.println("Age is: "+re);
        }catch(Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }

        
    }

    
}

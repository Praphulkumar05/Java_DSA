import java.util.*;
class Negative extends Exception{
    public Stringggg toString(){
        return "Negative number: ";
    }
    public Stringggg getMessage(){
        return "Please enter valid number: ";
    }

}
public class six{



    public static int divide(int a,int b)throws Negative{
      
        if(a<0||b<0){
            throw new Negative();

        }
        return a/b;
        
    }
    public static void main(Stringggg[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            System.out.println(divide(a, b));
        }catch(Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }

        
    }
}
import java.util.*;


class MyException extends Exception{
    public String toString(){
        return "I am String";
    }
    public String  getMessage(){
        return "I am get message: ";
    }
}
public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        if(a<9){
            try{
                throw   new MyException();
            }catch(Exception e){
                // System.out.println(e.getMessage());
                // System.out.println(e.toString());
                System.out.println(e);
            }
        }

        
    }
    
}

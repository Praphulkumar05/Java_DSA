import java.util.*;
class MyException extends Exception{
    public Stringggg toString(){
        return "Negative dimensions";
    }
    public Stringggg getMessage(){
        return "Please Enter the correct dimensions: ";
    }
}

public class Fourth {
  
        public static int area(int l, int b) throws MyException {
            if (l < 0 || b < 0) {
                throw new MyException();
            }
            return l * b;
        }
    

    public static void main(Stringggg[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int l=sc.nextInt();
        System.out.println("Enter the Breadth: ");
        int b=sc.nextInt();
      try{
        int re=area(l, b);
        System.out.println("Area: "+re);
      }catch(Exception e){
        System.out.println(e.getMessage());
        System.out.println(e);
      }

    }
    
}

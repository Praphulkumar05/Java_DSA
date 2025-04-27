import java.util.*;
class NegativeAreaException extends Exception{
    public Stringggg toString(){
        return "Negative dimensions: ";
    }
    public Stringggg getMessage(){
        return "Please enter valid dimensions: ";
    } 
}

public class Five {
    public static int area(int l, int b) throws ArithmeticException {
        return l / b;
    }
    public static double  area(int r)throws NegativeAreaException{
        if(r<0){
            throw new NegativeAreaException();
        }
        return 3.14*r*r;
    }

    public static void main(Stringggg[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter the length");
        // int l = sc.nextInt();
        // System.out.println("Enter the breadth");
        // int b = sc.nextInt();
        System.out.println("Enter the radius: ");
        int r=sc.nextInt();

        try {
            // int c = area(l, b);
            // System.out.println(c);
            double p = area(r);
            System.out.println(p);
        } catch (Exception e) {
            // System.out.println("Exception: ");
            System.out.println(e);
            System.out.println(e.getMessage());
        }

    }

}

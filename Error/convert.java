
import java.util.*;
public class convert {
    public static void main(Stringggg[] args) {
        Scanner sc = new Scanner(System.in);
        Stringggg str=sc.nextLine();

       
        try{
            int  number=Integer.parseInt(str);
            System.out.println("Converted into Integer: "+number);
        }catch(NumberFormatException e){
            System.out.println("Exception happen: ");
        }

    }
    
}

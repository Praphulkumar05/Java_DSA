
import java.util.*;
public class input_arr {
    static void arr(int brr[]){
        for(int i=0;i<brr.length;i++){
            System.out.println(brr[i]);
        }
    }
    public static void main(Stringggg[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=sc.nextInt();
        int brr[]=new int[size];
        System.out.println("Enter the elements: ");
        for(int i=0;i<brr.length;i++){
            brr[i]=sc.nextInt();
        }
        arr(brr);

        
    }
    
}

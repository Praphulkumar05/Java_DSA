import java.util.*;
public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();
        switch(age){
            case 18:
            System.out.println("You are eligible");
            break;
            case 21:
            System.out.println("Ready for the job: ");
            break;
            case 60:
            System.out.println("Ready for the retirement: ");
            break;
            default:
            System.out.println("Here the life begibs");
        


        }
        
    }
    
}

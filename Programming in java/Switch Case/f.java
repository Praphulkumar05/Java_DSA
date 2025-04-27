
import java.util.*;
public class f {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Marks");
        int marks =s.nextInt();
        String Grade;
        if(marks>=90&& marks <100){
            Grade="A";
        }else if(marks>=80&& marks<89){
            Grade ="B";

        }else if (marks>=70 && marks<79){
            Grade="C";
        }else if(marks>=60 && marks<69){
            Grade="D";
        }else if (marks>=50 && marks<59){
            Grade ="E";

        }else {
            Grade= "F";
        }

        switch(Grade){
            case "A":
            System.out.println("Excellent");
            break;
            case "B":
            System.out.println("Good");
            break;
            case "C":
            System.out.println("Fair");
            break;
            case "D":
            System.out.println("Needs Improvement");
            break;
            case "E":
            System.out.println("Poor");
            break;
            case "F":
            System.out.println("Fail");
            break;
            default :
            System.out.println("Thnak you ");

        }
        
    }
    
}

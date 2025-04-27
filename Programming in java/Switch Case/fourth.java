import java.util.*;

public class fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cat;
        if  (a % 2 == 0 && a % 3 == 0) {
            cat = 0;
        } else if (a % 3 == 0) {
            cat = 1;
        } else if(a % 2 == 0) {
            cat = 2;
        } else {
            cat = 3;

        }
        switch (cat) {
            case 0:
            System.out.println("Number is divisible by 2  and 3 ");
               
                break;
            case 1:
                System.out.println("Number is divisible by 3");
                break;
            case 2:
                System.out.println("Number is divisible by 2 ");
                break;
            case 3:
            System.out.println("Number is not divisible by 2 and 3");
                break;
            default:
                ;
                System.out.println("Exit");
                break;

        }
    }

}

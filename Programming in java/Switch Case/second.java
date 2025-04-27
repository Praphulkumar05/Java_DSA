import java.util.*;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age ");
        int age = sc.nextInt();
        int category;
        if (age <= 18) {
            category = 0;

        }
        else if (age > 18&&age<20) {
            category = 1;

        }
        else if(age>20) {
            category = 2;

        }
        else{
            category =3;
        }
        switch (category) {
            case 0:
                System.out.println("You are not eligible");
                break;
            case 1:
                System.out.println("You are good for the age");
                break;
            case 2:
                System.out.println("You are good for the job");
                break;
                case 3:
                System.out.println("Ready for the retirement: ");
                break;

            default:
                System.out.println("Life is good");
        }

    }

}

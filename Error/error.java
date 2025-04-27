import java.util.*;

public class error {
    public static void main(Stringggg[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 4 };
        System.out.println("Enter the index: ");
        int idx = sc.nextInt();
        System.out.println("Enter the number you  want to divide: ");
        int number = sc.nextInt();
        try {
            System.out.println("The value entered is: " + arr[idx]);
            System.out.println("The value of array/number: " + arr[idx] / number);
        }catch  (ArithmeticException e){
            System.out.println(e);
        }  catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }  catch(Exception e){
            System.out.println("Some other Exception happen: ");
        }

    }

}

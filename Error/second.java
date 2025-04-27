import java.util.Scanner;

public class second {
    public static void main(Stringggg[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4};

        boolean flag = true;
        while (flag) {
            System.out.print("Enter an index: ");
            int idx = sc.nextInt();
            try {
                System.out.println("Welcome: ");
                System.out.println(arr[idx]);
                flag = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Sorry, error found: ");
                System.out.println("Error happened in level 2. Index out of bounds.");
            } catch (Exception e) {
                System.out.println("Error happened in level 1.");
            }
        }
        System.out.println("Thanks for using this program!");
    }
}

import java.util.Scanner;

public class Powerr {
    int po(int x, int n) {
       
        if (n == 0) {
            return 1;
        }
        int ans = po(x, n / 2);
        if (n % 2 == 0) {
            return ans * ans;
        } else {
            return ans * ans * x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term:");
        int x = sc.nextInt();
        System.out.println("Enter the power:");
        int n = sc.nextInt();
        Powerr pk = new Powerr();
        int r = pk.po(x, n);
        System.out.println("Final answer: " + r);

    }
}

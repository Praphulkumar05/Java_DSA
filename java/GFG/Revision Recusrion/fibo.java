import java.util.*;
public class fibo {
    int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth term");
        int n=sc.nextInt();
        fibo f = new fibo();
        int r = f.fib(n);
        System.out.println(r);

    }

}

import java.util.Scanner;

public class trailingzero {
    int countzero(int a) {
        int fact = 1;
        int count = 0;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
            while (fact % 10 == 0) {
                count++;
                fact = fact / 10;
            }

        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        trailingzero t=new trailingzero();
        int result=t.countzero(a);
        System.out.println("The count of zero are "+result);

    }

}

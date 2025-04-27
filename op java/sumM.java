import java.util.*;

class Algebra {
    int a;
    int b;

    Algebra(int x, int y) {
        a = x;
        b = y;
    }

    int sum() {
        return a + b;
    }

    int sub() {
        return a - b;

    }

    int product() {
        return a * b;
    }

}

public class sumM {

    public static void main(Stringggg[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        Algebra a1= new Algebra(2, 2);
        System.out.println(a1.sum());
        System.out.println(a1.sub());
        System.out.println(a1.product());
        System.out.println();
        Algebra a2= new Algebra(3, 3);
        System.out.println(a2.sum());
        System.out.println(a2.sub());
        System.out.println(a2.product());
        System.out.println();
        Algebra a3= new Algebra(4, 4);
        System.out.println(a3.sum());
        System.out.println(a3.sub());
        System.out.println(a3.product());


        

    }

}

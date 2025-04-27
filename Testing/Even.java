import java.util.*;

public class Even {
    public static int Even(int n) {
        if (n >= 1 && n <= 60) {
            if (n % 2 == 0) {
                return 1;
            } else {
                return 2;
            }
        } else {    
            return 3;
        }
    }

    public static void main(Stringggg[] args) {
        // int srt=1;
        // int end =60;
        // for(int i=srt;i<end;i++){
        // if(i%2==0){
        // System.out.print(i+" ");

        // }
        // }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Even(n));

    }

}

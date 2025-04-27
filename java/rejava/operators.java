//package rejava;
import java.util.Scanner;

// public class operators {
//     public static void main(String[] args) {

//     Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int result=a+b;
//         System.out.println("Sum is : "+result);

        
//     }
    
// }
public class operators{
    // public static void main(String[] args) {
    //     boolean p=false;
    //     boolean q=false;
    //     boolean r=true;
    //     System.out.println(p==q==r);

    // }
//     public static void main(String[] args) {
//         int a=5;
//         int b=2;
//         int result=a%b;
//         System.out.println(result);
//     }
public boolean leapYear(int a){
    return(a%4==0 && a%100!=0)|| (a%400==0);
}


public static void main(String[] args) {
    Scanner  sc=new Scanner(System.in);
    int a=sc.nextInt();
    operators p=new operators();
    // p.leapYear(a);
    if(p.leapYear(a)){
        System.out.println("It is a leap year");
    }else{
        System.out.println("No it is not a leap year");
    }
    


    
    
}
 }

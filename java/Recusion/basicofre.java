//  package Recusion;
// import java.util.*;


// public class basicofre {
//     static void func1(){
//         System.out.println("fun1");
//     }
//     static void fun2(){
//         System.out.println("Before fun1");
//         func1();
//         System.out.println("After func1");
//     }
//     public static void main(String[] args) {
//         System.out.println("Before func2");
//         fun2();
//         System.out.println("After func2");
        
//     }
    
// }
import java.util.*;
public class basicofre{
    void gret(int a){
        if(a==0)return; 
        System.out.println("Good moring");
        gret(a-1);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        basicofre p=new basicofre();
        p.gret(a);
    }
}
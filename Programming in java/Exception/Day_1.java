import java.util.*;
// class MyException extends Exception{
//     public String toString(){
//         return "Error";
//     }
//     public String getMessage(){
//         return "Please enter the valid: ";
//     }
// }
// class MyyException extends Exception{
//     public String toString(){
//         return "Can not divide by zero: ";
//     }
//     public String getMessage(){
//         return "Message from me: ";
//     }

// }
// class MyyyException extends Exception{
//     public String toString(){
//         return "Array out of bound";
//     }
//     public String getMesasge(){
//         return " Please Enter the idx that is present: ";
//     }
// }



public class Day_1 {
    
    // public static int Divide(int a,int b)throws MyyException{
    //     if(b==0){
    //         throw new MyyException();
    //     }
    //     return a/b;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        int n = arr.length;
        int idx=sc.nextInt();
        boolean flag = true;
       while(flag){
        try{
            System.out.println(arr[idx]);
            flag=false;
          

        }catch(ArrayIndexOutOfBoundsException  e){
           System.out.println("Error");
            break;
        }
       }

        
    }
    
}

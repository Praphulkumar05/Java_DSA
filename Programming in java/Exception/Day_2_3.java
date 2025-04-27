import java.util.*;
class ArrayIndexOutOfBoundsException extends Exception{
    public String toString(){
        return "Enter the valid idx"
;    }
public String getMessage(){
    return "Wrong idx";
}
}
public class Day_2_3 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size=sc.nextInt();
        int arr[]= new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       
        try{
            System.out.println("Enter the idx");
        int idx=sc.nextInt();
        if(idx>arr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }else{
            System.out.println(arr[idx]);
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    //     Scanner sc = new Scanner(System.in);
    //     int size=sc.nextInt();
    //     int arr[]= new int[size];
    //     for(int i=0;i<arr.length;i++){
    //         arr[i]=sc.nextInt();

    //     }
    //     try{
    //     System.out.println("Enter the idx: ");
    //     int idx=sc.nextInt();
    //     System.out.println(arr[idx]);
     

       
    // }catch(ArrayIndexOutOfBoundsException e){
    //     System.out.println("no");
    // }
        
        
        
    }
    
}

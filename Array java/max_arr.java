
import java.util.*;
public class max_arr {

    static int max(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]) max=arr[i];
        }
        return max;
    }
    public static void main(Stringggg[] args) {
        int arr[]={1,2,3,4};
        int r=max(arr);
        System.out.println(r);
        
    }
    
}
// static int max(int arr[]){
//     int max=Integer.MIN_VALUE;
//     int masxindex=-1;
//     for(int i=0;i<arr.length;i++){
//         if(max<arr[i])
//          max=arr[i] ;
//          masxindex=i;
        
        
//     }
//     return masxindex;
    
// }

// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int arr[]=new int[n];
//     for(int i=0;i<arr.length;i++){
//         arr[i]=sc.nextInt();
//     }
//     for(int i=0;i<arr.length;i++){
//         System.out.println(arr[i]);
//     }

//     int masxindex = max(arr);  // Get the maximum element
//     System.out.println(masxindex);
// }

// }

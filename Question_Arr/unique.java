import java.util.*;
public class unique {

    public static int Duplicate(int arr[]){
        int n =arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                    

                }
            }
            
        }
        return -1;
    }

    // public static int LArgest(int arr[]){
    //     int n= arr.length;
    //     int max=arr[0];
    //     int Smax=0;
    //     for(int i=1;i<n;i++){
    //         if(arr[i]>max){
    //             max=arr[i];
    //         }
    //     }
    //     for(int i =0;i<n;i++){
    //         if(arr[i]<max){
    //             Smax=arr[i];
    //         }
    //     }
    //     return Smax;
        

        

    // }

    // public static boolean U(int arr[]){
    //     int n=arr.length;
    //     int ans=-1;
    //     boolean flag = false;
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             if(arr[i]==arr[j]){
    //                 arr[i]=-1;
    //                 arr[j]=-1;
    //                 // flag=true;  
                    
    //             }
    //         }
    //         flag=true;  
    //     }
    //     for(int i=0;i<n;i++){
    //         if(arr[i]>0){
    //             ans=arr[i];
                
    //         }
    //     }
    //     return flag;
    
        
    // }
    // public static int Uni(int arr[]){
    //     int n=arr.length;
    //     int ans =-1;
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             if(arr[i]==arr[j]){
    //                 arr[i]=-1;
    //                 arr[j]=-1;

    //             }

    //         }
    //     }
    //     for(int i=0;i<n;i++){
    //         if(arr[i]>0){
    //             ans=arr[i];
    //         }
    //     }
    //     return ans;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Duplicate(arr));
        
    }
    
}

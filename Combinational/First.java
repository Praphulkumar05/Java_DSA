import java.util.*;
public class First {
    // public static  void factor(int n){
    //     for(int i=1;i*i<=n;i++){
    //         if(n%i==0){
    //             System.out.println(i+" ");
    //         }if(i!=n/i){
    //             System.out.println((n/i)+" ");
    //         }
    //     }
    // }
    //     public static int SecLArget(int arr[]){
    //         int p= arr.length;
    //         int max=Integer.MIN_VALUE;
    //         int samx=0;
          
    //         for(int i=0;i<p;i++){
    //             if(arr[i]>max){
    //                 max=arr[i];
    //             }
    //             samx=max;
    //             if(arr[i]>samx){
    //                 samx=arr[i];
    //             }
                 
    //             }
    //             return samx;
            
    //     }
    public static int Sec(int arr[]){
        int n = arr.length;
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int i =0;i<n;i++){
            if(smax<arr[i]&&max!=arr[i]){
                smax=arr[i];
            }
        }

       
        boolean flag = true;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[0]){
                flag=true;
                break;
            }
        }
        if(flag){
            return -1;
        }
        return smax;

    }
            
        
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,77};
        System.out.println(Sec(arr));
        // for(int i=0;i<7;i++){
        //     int s = (int)Math.pow(2,i);
        //     for(int j=0;j<s;j++){
                
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
       // factor(36);
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int n = scanner.nextInt();
        // scanner.close();

        // System.out.print("Prime factors of " + n + " are: ");
        
        // // Step 1: Print the number of 2s that divide n
        // while (n % 2 == 0) {
        //     System.out.print(2 + " ");
        //     n /= 2;
        // }

        // // Step 2: Check for odd factors from 3 to sqrt(n)
        // for (int i = 3; i * i <= n; i += 2) {
        //     while (n % i == 0) {
        //         System.out.print(i + " ");
        //         n /= i;
        //     }
        // }

        // // Step 3: If n is still greater than 2, it is a prime factor
        // if (n > 2) {
        //     System.out.print(n);
        // }
        // int arr[]={12,35,1,10,34,2};
        // System.out.println(SecLArget(arr));

        
         
    }
}


       



import java.util.Arrays;

public class SortZerosAndOne {
    // public static int[] Zeros(int arr[]){
    //     int n =arr.length;
    //     int zerocount=0;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]==0){
    //             zerocount++;
    //         }
    //     }
    //     for(int i=0;i<=zerocount-1;i++){
    //         arr[i]=0;
    //     }
    //     for(int i=zerocount;i<arr.length;i++){
    //         arr[i]=1;
    //     }
    //     return arr;
    // }
    // public static void Zero(int arr[]){
    //     int n = arr.length;
    //     int zerocount=0;
    //         for(int i=0;i<n;i++){
    //             if(arr[i]==0){
    //                 zerocount++;
    //             }
    //         }
    //         for(int i=0;i<=zerocount-1;i++){
    //             arr[i]=0;
    //         }
    //         for(int i=zerocount;i<arr.length;i++){
    //             arr[i]=1;
    //         }
    //       for(int i=0;i<n;i++){
    //         System.out.print(arr[i]+" ");
    //       }
        
    // }

    // public static int [] Ones(int arr[]){     //usig two pointers
    //     int n = arr.length;
    //     int left =0;
    //     int right=n-1;
    //     while(left<right){
    //        if(arr[left]==1&&arr[right]==0){
    //         int temp = arr[left];
    //         arr[left]=arr[right];
    //         arr[right]=temp;
    //         left++;
    //         right--;
    //        }else if (arr[left]==0){
    //         left++;
           
    //        }else{
    //         right--;
    //        }
    //     }
    //     return arr;
    // 
    public static int [] EvenOdd(int arr[]){
        int n =arr.length;
        int left =0;
        int right=n-1;
        while(left<right){
            if(arr[left]%2==0&&arr[right]%2!=0){
                left++;
                right--;
            }else if (arr[left]%2!=0&& arr[right]%2==0){
                int temp =arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }else{
                right--;
            }
        }
      
        return arr;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7};
        int ans[]= EvenOdd(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        
       
       
        
    }
    
}

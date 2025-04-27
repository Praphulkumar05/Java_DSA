

public class RotateArraKth {
  
    public static void re(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static int[] Kth(int arr[],int k){
        int n = arr.length;
        if(k>n){
            k=k%n;    //if the k is greater than the n then in that case arrayIdexoutofbound arr will come to preserse from this error we use 5 operator to be in the length of the arr.
        }

        // re(arr, 0, n-k-1);
        // re(arr, n-k, n-1);
        // re(arr, 0, n-1);
        re(arr,0,n-1);
        re(arr,0,k-1);
        re(arr, k, n-1);
        return arr;
    }
    
    

    

        
        
     
      
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 2;
        
        System.out.println();
        int ans[]= Kth(arr, k);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        
    }
    
}

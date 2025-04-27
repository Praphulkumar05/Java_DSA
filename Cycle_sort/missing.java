

public class missing {
    public static int [] missingNumber(int[] arr) {
        int n =arr.length;
        int i =0;
        while(i<n){
            int correctIdx=arr[i];         
          if(correctIdx<n&&arr[i]!=i){
            int temp = arr[i];
            arr[i]=arr[correctIdx];
            arr[correctIdx]=temp;

          }
                
            else{
               i++;
            }
        }
        
        // for(int j=0;j<n;j++){
        //     if(arr[j]!=j){
        //         return j;
        //     }
        // }
        // return n;
        return arr;
     

     
        
    }
    
    public static void main(String[] args) {
        int arr[]={1,3,4,5,2};
        // System.out.print(missingNumber(arr)+" ");
        int ans[] = missingNumber(arr);
        for(int i =0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        
    }
}

public class Pivot_idx {
    public static int idx(int arr[]){
        int n = arr.length;
        int lSum=0;
        int rSum=0;
        int t=0;
        for(int i =0;i<n;i++){
            t+=arr[i];
        }
        for(int i =0;i<n;i++){
            rSum=t-lSum-arr[i];
            if(lSum==rSum){
                return i;
            }
            lSum+=arr[i];
        }
        return -1;
      
        
    }
    public static void main(String[] args) {
        int arr[]={-1,-1,-1,-1,-1,0};
        System.out.println(idx(arr));
        
    }
    
}

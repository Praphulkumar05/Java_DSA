public class SmallestMissingNumber {
    public static int Smallest(int arr[]){
        int n = arr.length;
        int idx=-1;
        //this is linear search O(n).....
        // for(int i =0;i<n;i++){
        //     if(i!=arr[i]){
        //         idx=i;
        //         break;

        //     }
        // }
        // return idx;

        //this binary search O(log n).....
        int ans=-1;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid =low+(high-low)/2;
            if(arr[mid]==mid){
               low=mid+1;
            }else{
                ans=mid;
                high=mid-1;

            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5};
        System.out.println(Smallest(arr));
        
    }
    
}

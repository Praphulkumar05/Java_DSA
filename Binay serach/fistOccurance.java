import java.util.Arrays;

public class fistOccurance {
    public static int[] Found(int arr[], int key) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int idx = -1;
        int idx2=-1;
        boolean flag = false;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                if ( mid==0 ||arr[mid - 1] != key) {
                    flag = true;
                    idx = mid;
                    idx2=mid+1;
                    break;
                } else {
                    high = mid - 1;

                }
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if(idx==-1){
            return new int[]{-1,-1};
        }
        return new int[]{idx, idx2}; 
      
        // if(flag==false) System.out.println("-1,-1");
        // return null;
        // int[] ans = {idx, idx2};
        //    return ans;
    
        
        

    }

    public static void main(String[] args) {
        int arr[] = {1};
        int key = 1;
        // System.out.println(Found(arr, key));
         System.out.println(Arrays.toString(Found(arr, key)));

    }

}

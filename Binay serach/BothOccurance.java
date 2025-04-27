public class BothOccurance {
    public    int [] re(int arr[],int target){
        int first = first(arr,target);
        int sec=sec(arr, target);
        return new int[]{first,sec};



    }
    public int first(int arr[],int target){
        int n = arr.length;
        int low=0;
        int high=n-1;
        int first =-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                first=mid;
                high=mid-1;

            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return first;
    }
    public int sec(int arr[],int target){
        int n = arr.length;
        int low=0;
        int high=n-1;
        int sec =-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                sec=mid+1;
                high=mid-1;

            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return sec;
    }
    
    public static void main(String[] args) {
        int arr []={5,7,7,8,8,10};
        int target = 8;
        
        
    }
    
}

public class Peek {
  
    public static int Peek(int arr[]) {
        int n = arr.length;
        int lo = 0;
        int hi = n - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = lo+(hi-lo)/2;
            if((mid==0||arr[mid]>=arr[mid-1])&&
            (mid==n-1||arr[mid]>=arr[mid+1])){
                System.out.println(arr[mid]);
                return mid;
            }
            if(mid>0&&arr[mid-1]>arr[mid]){
                hi=mid-1;

            }else{
                lo=mid+1;
            }
              
            
            
        }
            return -1;
           

    
}

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1 };
        System.out.println(Peek(arr));

    }
}

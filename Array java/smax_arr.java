public class smax_arr {
   static  void smax(int arr[]){
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]) max=arr[i];
        }
        for(int j=0;j<arr.length;j++){
            if(smax<arr[j]&& max!=arr[j]) smax=arr[j];
        }
        System.out.println(smax);
        
        
    }
    void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(Stringggg[] args) {
        int arr[]={1,2,3,4};
        smax(arr);
        
        
        
    }
    
}

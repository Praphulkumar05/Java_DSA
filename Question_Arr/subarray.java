public class subarray {
    public static void Subarr(int arr[]){
        int n = arr.length;
        int sum=0;
        for(int i =0;i<n;i++){
            for(int j =i;j<n;j++){
                for(int k =i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                   // System.out.print();
                   sum+=arr[k];
                }
                System.out.println();
            }
        }
        System.out.println("Sum will be: " +sum);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        Subarr(arr);
        
    }
    
}

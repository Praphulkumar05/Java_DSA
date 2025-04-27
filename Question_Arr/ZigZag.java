public class ZigZag {
    public static void swap(int arr[]){
        int n =arr.length;
        int  i =0;
        int j  = n-1;
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;    

    }
    public static boolean Zig_Zag(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n-1   ;i++){
            if(i%2==0){
                if(arr[i]>arr[i+1]){
                    swap(arr);
                }
            }else{
                if(arr[i]<arr[i+1]){
                    swap(arr);
                }
            }

        }
        for(int i =0;i<n-1;i++){
            if((i%2==0&&arr[i]>arr[i+1])||
            (i%2==1&&arr[i]<arr[i+1])){
                return false;
            }
        }
        return true;

     

    }

    public static void main(String[] args) {
        int arr[] = { 4, 7, 3, 8, 2 };
      boolean zing= Zig_Zag(arr);
      System.out.println(zing);

    }

}

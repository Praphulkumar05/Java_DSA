public class rotate_arr {
    static  void reverse(int arr[],int i,int j){
        int temp=0;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    static void rotate(int arr[],int k){
        int size=arr.length;
         k=k%size;
         reverse(arr, 0, size-k-1);
         reverse(arr, size-k, size-1);
         reverse(arr, 0, size-1);


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        //int re=rotate(arr, 2);
        rotate(arr, 3);
        for(int num:arr){
            System.out.println(num+"");
        }
        
    }
}

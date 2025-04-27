public class HomeWork {

    // public static void reverse(int arr[]){
    // int n = arr.length;
    // // for(int i=n-1;i>=0;i--){
    // // System.out.print(arr[i]+" ");
    // // }
    // // System.out.println();
    // int left =0;
    // int right=n-1;
    // while(left<=right){
    // int temp = arr[left];
    // arr[left]=arr[right];
    // arr[right]=temp;
    // left++;
    // right--;
    // }
    // for(int i =0;i<n;i++){
    // System.out.print(arr[i]+" ");
    // }
    // System.out.println();
    // public static Boolean Sort(int arr[]) {
    //     int n = arr.length;
    //     // boolean flag = false;
    //     for (int i = 0; i < n - 1; i++) {
    //         if (arr[i] > arr[i + 1]) {
    //             return true;

    //         }
    //     }

    //     return false;
        // for(int i =0;i<n-1;i++){
        //     for(int j=i+1;j<n-1;j++){
        //         if(arr[i]<arr[j]){
        //             return false;
        //         }
        //     }
        // }
    //     // return true;

    // }
    public static int Ones(int arr[]){
        int n = arr.length;
        int count =0;
        // for(int i =0;i<n-1;i++){
        //     for(int j =i+1;j<n-1;j++){
        //         if(arr[i]==1&&arr[j]==1){
        //             count++;
        //         }

        //     }

        // }
        for(int i =0;i<n-1;i++){
            if(arr[i]==1&&arr[i+1]==1){
                count++;
            }
        }
        return count;
    }
 
    public static void main(String[] args) {
       int arr[]={1,0,1,1,0,1};
       System.out.println(Ones(arr));

    

    }

}
